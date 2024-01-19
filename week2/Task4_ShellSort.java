package com.Java.week2;

public class Task4_ShellSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        // Розташовуємо розряди доданої сортування Шелла
        for (int gap = length / 2; gap > 0; gap /= 2) {
            // Проводимо сортування методом вставки зі зміщенням gap
            for (int i = gap; i < length; i++) {
                int sav = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > sav; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = sav;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
