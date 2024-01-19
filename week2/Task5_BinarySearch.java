package com.Java.week2;

public class Task5_BinarySearch {
    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

//        int[] array = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
//        int target = 4;

        int result = binarySearch(data, numberToFind);

        if (result == -1) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
    // Бінарний пошук
    public static int binarySearch(int[] arr, int numberToFind) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Перевірка, чи елемент знаходиться у середині
            if (arr[mid] == numberToFind) {
                return mid; // Знайдено елемент, повертаємо позицію
            }

            // Якщо шуканий елемент менший, змінюємо праву межу пошуку
            if (arr[mid] > numberToFind) {
                right = mid - 1;
            } else {
                // Інакше змінюємо ліву межу пошуку
                left = mid + 1;
            }
        }

        return -1; // Елемент не знайдено
    }
}
