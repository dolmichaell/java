package com.Java.week2;

public class Task2_MatrixPrint {
    public static void main(String[] args) {
        int size = 5; // Розмірність матриці
        int[][] matrix = new int[size][size]; // Ініціалізація матриці

        // Заповнення матриці числами
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i + j == size - 1)) {
                    // Зірочки на діагоналях
                    System.out.print(" * ");
                    num++;
                } else {
                    // Числа всередині
                    matrix[i][j] = num++;
                    System.out.printf("%2d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
