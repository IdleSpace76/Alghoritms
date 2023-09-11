package ru.alghoritms.sort;

/**
 * Сортировка выбором
 * O(n * n)
 *
 * @author a.zharov
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("Numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        int[] newArr = new int[10];
        int smallest = 0;
        int smallestIndex = 0;

        for (int i = 0; i < newArr.length; i++) {
            smallest = 101;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }
            newArr[i] = smallest;
            arr[smallestIndex] = 101;
        }

        System.out.print("New array:");
        for (int i : newArr) {
            System.out.print(" " + i);
        }
    }
}
