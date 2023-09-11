package ru.alghoritms.search;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Бинарный поиск в упорядоченном массиве
 * O(log n)
 *
 * @author a.zharov
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = IntStream.rangeClosed(1, 100).toArray();

        Scanner scanner = new Scanner(System.in);
        int item;

        do {
            System.out.println("Think the num from 1 to 100: ");
            item = scanner.nextInt();
        }
        while (item < 1 || item > 100);

        int min = 0, max = list.length - 1, iterCount = 0, mid, guess;

        while (true) {
            iterCount++;
            mid = (max + min) / 2;
            guess = list[mid];
            if (guess == item) {
                break;
            }
            else if (guess > item) {
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }

        System.out.println("Num: " + guess + "\nIterations: " + iterCount);
    }
}
