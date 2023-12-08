package org.example;

public class MatrixAdd {
    public static int getSumOfElements(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
        // write code here
    }
}

//Реалізуй метод getSumOfElements(), який додає всі елементи матриці matrix і повертає одне ціле число.
//
//Примітки:
//
//матриця може бути будь-якого розміру
//матриця може мати і від'ємні числа
//метод приймає на вхід 2-вимірний масив
//Приклади:
//
//{{1, 0}, {0, 1}} // повертає 2
//{{7, 9}, {3, 6}} // повертає 25
