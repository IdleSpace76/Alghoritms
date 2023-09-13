package ru.alghoritms.sort;

/**
 * Алгоритм быстрой сортировки
 * O(n)
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

    }

    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        return newArr;
    }
}
