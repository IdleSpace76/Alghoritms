package ru.alghoritms.sort;

/**
 * Алгоритм быстрой сортировки
 * O(n * log n)
 *
 * @author a.zharov
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.print("Nums:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.print("New arr:");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }

    private static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
