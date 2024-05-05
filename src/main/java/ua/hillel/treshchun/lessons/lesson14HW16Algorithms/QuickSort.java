package ua.hillel.treshchun.lessons.lesson14HW16Algorithms;

public class QuickSort {

    public static void sort(int [] array){
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int [] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionArray(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex, high);
        }
    }

    private static int partitionArray (int [] array, int low, int high) {
        int first = array[low];
        int middle = array[(low + high)/2];
        int last = array[high];
//        choosing the median of the first, middle and last elements of the array
        int pivotElement = Math.max(Math.min(Math.max(first,middle),last), Math.min(first,middle));
        int leftIndex = low;
        int rightIndex = high;

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivotElement) {
                leftIndex++;
            }
            while (array[rightIndex] > pivotElement) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
