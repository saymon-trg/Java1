package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] myArrayInt = {1, 1, 0, 0, 1};
        for (int i = 0; i < myArrayInt.length; i++) {
            if (myArrayInt[i] == 1) {
                myArrayInt[i] = 0;
            } else {
                myArrayInt[i] = 1;
            }
        }

        //System.out.println(Arrays.toString(myArrayInt));
        //System.out.println("************************");

        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        int[] hundredArrayInt = new int[100];
        for (int i = 0; i < hundredArrayInt.length; i++) {
            hundredArrayInt[i] = i;
        }
        //System.out.println(Arrays.toString(hundredArrayInt));
        //System.out.println("************************");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] ArraySixTimesTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ArraySixTimesTwo.length; i++) {
            if (ArraySixTimesTwo[i] < 6) {
                ArraySixTimesTwo[i] += ArraySixTimesTwo[i];
            } else {

            }
        }
        //System.out.println(Arrays.toString(ArraySixTimesTwo));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];

        int[][] diagonal = new int[5][5];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
                //System.out.print(diagonal[i][j] +"\t");
            }
        }
    }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
        // типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] UserArray(int len, int initialValue) {
        len = scanner.nextInt();
        initialValue = scanner.nextInt();
        int[] Arr =  new int [len];
            for (int i = 0; i < Arr.length; i++) {
        Arr[i] = initialValue;
            }
        return Arr;
    }
}
