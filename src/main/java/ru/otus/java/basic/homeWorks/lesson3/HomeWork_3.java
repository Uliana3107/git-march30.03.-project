package ru.otus.java.basic.homeWorks.lesson3;
import java.util.Scanner;

public class HomeWork_3 {
    public static void main (String[] args) {
        int a = 5;
        int b = 26;
        int c = 14;

        greetings();
        checkSign(a,b,c);
        selectColor();
        compareNumbers();
        int initValue = 98;
        int delta = 34;
        boolean increment = false;
        addOrSubtractAndPrint(initValue, delta, increment);
        //6
        //  Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите целое число от 1 до 5");
        // int result_2 = scanner.nextInt();
        //  System.out.println(result_2);

    }
    //(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello,\nWorld,\nfrom,\nJava");
    }

    //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообûение “Сумма положительная”, в противном случае -
    //“Сумма отрицательная”;
    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительна");
        } else
            System.out.println("Сумма отрицательна");
    }

    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоли должно быть выведено сообщение "Красный" если от 10 до 20 включительно, то
    //“Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor() {
        int data = 25;
        if (data <= 10) {
            System.out.println("Красный");
        } else if ((data > 10) &&(data <= 20)) {
            System.out.println("Желтый");
        } else if (data>20) {
            System.out.println("Зеленый");
        }
    }

    //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    //Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = 170;
        int b = 30;
        if (a > b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

    //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    // в противном случае - вычесть и отпечатать ;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
            System.out.println(result);
        } else {
            result = initValue - delta;
            System.out.println(result);
        }
    }
}

