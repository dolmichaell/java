package com.Java.week2;

public class Task1_SquareRoot {
    public static void main(String[] args) {
        double a = 3;
        double b = -16;
        double c = -12;

        if (a == 0 & b == 0 & c == 0) {
            String x1 = "";
            String x2 = "";
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (a == 0 & b == 0) {
            String x1 = "";
            String x2 = "";
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (a == 0 & c == 0) {
            double x1 = 0;
            double x2 = 0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (a == 0) {
            double x1 = -c / b;
            double x2 = -c / b;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if (discriminant == 0) {
                double x1 = -b / (2 * a);
                double x2 = -b / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {
                String x1 = "";
                String x2 = "";
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }
    }
}
