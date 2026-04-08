package ru.otus.java.basic.homeWorks.lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        calc();
        text();
    }

    public static void calc() {
        int a = 6;
        int b = 50;
        int c = 100;
        int result;
        if (a > b) {
            result = b + c;
        } else result = a + c;
        System.out.println(result);
    }

    public static void text() {
        int r = 15;
        r++;
        r = r / 2;
        if (r > 0) {
            System.out.println("Hello, World");
        }


    }}