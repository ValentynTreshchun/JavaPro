package ua.hillel.treshchun.lessons.lesson14HW16Algorithms;

import java.util.Arrays;

public class HW16 {
    public static void main(String[] args) {
        int [] array1 = {2, -5, 45, 34, 8, 109, 27, 17, -2, -5, 67, 49, 51, 97, 87, 15, 23, 53, 89, 11, 4, 88, 5, 97, -119, 67, 71, 78, 70, -9, 12, 38, 49, 58};
        int [] array2 = {2, -5, 45, 34, 8, 109, 27, 17, -2, -5, 67, 49, 51, 97, 87, 15, 23, 53, 89, 11, 4, 88, 5, 97, -119, 67, 71, 78, 70, -9, 12, 38, 49, 58};
        int [] array3 = {2, -5, 45, 34, 8, 109, 27, 17, -2, -5, 67, 49, 51, 97, 87, 15, 23, 53, 89, 11, 4, 88, 5, 97, -119, 67, 71, 78, 70, -9, 12, 38, 49, 58};
        QuickSort.sort(array1);
        System.out.println(Arrays.toString(array1));

        ShakerSort.bubbleSort(array2);
        System.out.println(Arrays.toString(array2));

        ShakerSort.bubbleSortImproved(array3);
        System.out.println(Arrays.toString(array3));
    }
}
