package com.hillel.lecture_4;

import static java.lang.Math.sin;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        for (double i = 0; i <= 360; i++) {
            if (i % 10 == 0) {
                double sin = sin(Math.toRadians(i));
                System.out.printf("Синус %.0f градусов равен %.4f%n", i, sin);
            }
        }
    }
}


