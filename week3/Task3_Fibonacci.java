package com.Java.week3;

public class Task3_Fibonacci {

    // Повертає число Фібоначчі за номером, нумерація починається з одиниці
    // якщо число не можливо вирахувати, повертає -1
    public static long getNumber(int position) {
        if (position < 1) {
            // Номер поза межами послідовності
            return -1;
        } else if (position == 1 || position == 2) {
            // Базовий випадок: перші два числа Фібоначчі рівні 1
            return 1;
        } else {
            // Рекурсивний виклик для обчислення числа Фібоначчі
            return getNumber(position - 1) + getNumber(position - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumber(7));
    }
}
