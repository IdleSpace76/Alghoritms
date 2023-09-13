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

        int minPos = 0, maxPos = list.length - 1, iterCount = 0, midPos, guessNum;

        while (true) {
            iterCount++;
            midPos = (maxPos + minPos) / 2;
            guessNum = list[midPos];
            if (guessNum == item) {
                break;
            }
            else if (guessNum > item) {
                maxPos = midPos - 1;
            }
            else {
                minPos = midPos + 1;
            }
        }

        System.out.println("Num: " + guessNum + "\nIterations: " + iterCount);
    }
}
