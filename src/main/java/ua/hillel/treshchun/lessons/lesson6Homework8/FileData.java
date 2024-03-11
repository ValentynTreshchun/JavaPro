package ua.hillel.treshchun.lessons.lesson6Homework8;

public class FileData implements Comparable<FileData>{

    private String fileName;
    private long byteSize;
    private String filePath;

    public FileData(String fileName, long byteSize, String filePath) {
        this.fileName = fileName;
        this.byteSize = byteSize;
        this.filePath = filePath;
    }

    @Override
    public int compareTo(FileData o) {
        return Long.compare(this.byteSize, o.byteSize);
    }

    public String getFileName() {
        return fileName;
    }

    public long getByteSize() {
        return byteSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "{" +
                "name: '" + fileName + '\'' +
                ", size: " + byteSize +
                '}';
    }
}
