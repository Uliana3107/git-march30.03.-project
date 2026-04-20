package ru.otus.java.basic.homeWorks.lesson4;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        //1
        String message = "Hello!";
        int i = (int) (Math.random() * 10);
        exercise1(message, i);
        //2
        int[] myArray = {2, 5, 9, 1, 11, 25, 58, 1, 0};
        exercise2(myArray);
        //3
        int d = 50;
        exercise3(myArray,d);
        //4
        int[] myArray2 = {12, 105, 90, 10, 11, 25, 580, 1, 780,47,95};
        exercise4(myArray2,d);
        //5
        int[] myArray3 = {2, 5, 9, 1, 11, 25, 58, 1, 0};
        exercise5(myArray3);
    }
    public static void exercise1(String message, int i) {
        for (int a = 0; a < i; a++) {
            System.out.println(a + ") " + message);
        }
    }
    public static void exercise2(int[] qwe) {
        int sum = 0;
        for (int i = 0; i < qwe.length; i++) {
            if (qwe[i] > 5) {
                sum += qwe[i];
            }
        }
        System.out.println(sum);
    }
    public static void exercise3(int[] myArray, int d){
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = d;
        } System.out.println(Arrays.toString(myArray));
    }
    public static void exercise4(int[] myArray2, int d){
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] += d;
        } System.out.println(Arrays.toString(myArray2));
    }
    //-Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль сумма элементов какой из половин массива больше. {2, 5, 9, 1, 11, 25, 58, 1, 0};
    public static void exercise5(int[] myArray3)  {
        int maxSum;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < myArray3.length / 2 ;i++) {
            sum1+=myArray3[i];
        }
        for (int i = myArray3.length / 2; i < myArray3.length;i++) {
            sum2+=myArray3[i];
        }
        maxSum = Math.max(sum1,sum2);
        System.out.println(maxSum);
    }

}
