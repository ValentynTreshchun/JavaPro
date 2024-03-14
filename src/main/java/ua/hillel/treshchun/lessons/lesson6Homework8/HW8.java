package ua.hillel.treshchun.lessons.lesson6Homework8;

public class HW8 {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData file1 = new FileData("file1", 10, "path1");
        FileData file2 = new FileData("file2", 15, "path1");
        FileData file3 = new FileData("file3", 20, "path2");
        FileData file4 = new FileData("file4", 25, "path3");
        FileData file5 = new FileData("file5", 1, "path1");
        FileData file6 = new FileData("file6", 2, "path2");
        FileData file7 = new FileData("file7", 95, "path3");

        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);
        fileNavigator.add(file4);

        System.out.println(fileNavigator);

        System.out.println("All files in path1: " + fileNavigator.find("path1"));
        System.out.println("All files in path2: " + fileNavigator.find("path2"));

        System.out.println(fileNavigator.filterBySize(20));

        fileNavigator.remove("path1");
        System.out.println(fileNavigator);

        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file5);
        fileNavigator.add(file6);
        fileNavigator.add(file7);
        System.out.println(fileNavigator.sortBySize());

        FileData file8 = new FileData("file8", 95, "path4");
        fileNavigator.add("path5", file8);
    }
}
