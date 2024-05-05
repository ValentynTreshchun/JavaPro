package ua.hillel.treshchun.lessons.lesson14HW16Algorithms;

public class ShakerSort {

    public static void bubbleSort(int [] array) {
        for (int j = 0; j < array.length; j++) {
            boolean swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }

    public static void bubbleSortImproved(int [] array) {
        int newTopBoundary = array.length - 1;
        int newBottomBoundary = 0;
        int boundaryReached = newBottomBoundary;
        while (newBottomBoundary < newTopBoundary) {
            boolean swap = false;
            for (int j = 0; j < newTopBoundary; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swap = true;
                    boundaryReached = j;
                }
            }
            if(!swap) break;
            newTopBoundary = boundaryReached;
            for (int k = newTopBoundary; k > newBottomBoundary; k--) {
                if (array[k] < array[k - 1]) {
                    int temp = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = temp;
                    boundaryReached = k;
                }
            }
            newBottomBoundary = boundaryReached;
        }
    }

}
