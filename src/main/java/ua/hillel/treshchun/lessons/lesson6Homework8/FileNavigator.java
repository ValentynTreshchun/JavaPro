package ua.hillel.treshchun.lessons.lesson6Homework8;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    private Map<String, List<FileData>> fileList;

    public FileNavigator() {
        fileList = new HashMap<>();
    }

    public void add(FileData file){
        if (fileList.putIfAbsent(file.getFilePath(), new ArrayList<>(List.of(file))) != null) {
            fileList.get(file.getFilePath()).add(file);
        }
    }

    public void add(String filePath, FileData file){
        if (filePath.equals(file.getFilePath())) {
            add(file);
        } else {
            System.out.println("Error: provided path is different from specified in file");
        }
    }

    public List<FileData> find(String lookupFilePath){
        return fileList.get(lookupFilePath);
    }

    public List<FileData> filterBySize(long limitByteSize){
        List<FileData> result = new ArrayList<>();
        fileList.forEach((path, list) -> list.forEach((file) -> {
            if (file.getByteSize() <= limitByteSize) {
                result.add(file);
            }
        }));
        return result;
    }

    public void remove(String rmFilePath){
        fileList.get(rmFilePath).clear();
        fileList.remove(rmFilePath);
    }

    public List<FileData> sortBySize(){
        List<FileData> sortedList = new ArrayList<>();
        fileList.forEach((path, list) -> sortedList.addAll(list));
        Collections.sort(sortedList);
        return sortedList;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                fileList +
                '}';
    }

    public Map<String, List<FileData>> getFileList() {
        return Map.copyOf(fileList);
    }
}

