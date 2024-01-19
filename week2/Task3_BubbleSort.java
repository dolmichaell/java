package com.Java.week2;

public class Task3_BubbleSort {
    // метод бульбашки - більший елемент переміщаємо вправо (в кінець)
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Поміняйте arr[j] і arr[j + 1]
                    int sav = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sav;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
