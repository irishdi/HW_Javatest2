package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Задание 1.
        Integer[] intArr = new Integer[2];
        intArr[0] = 2;
        intArr[1] = 3;
        System.out.println("Массив 1:");
        System.out.println(Arrays.deepToString(intArr));
        System.out.println("Поменять местами:");
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));
        System.out.println("******");
//Задание 2.

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
//        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> boxApple = new Box<>(apple1, apple2);
        System.out.println("В коробке1 яблок: "+ boxApple.getItems().size() + " шт.");
        Box<Orange> boxOrange = new Box<>(orange1, orange2);
        System.out.println("В коробке2 апельсинов: " + boxOrange.getItems().size() + " шт.");

        System.out.println("Вес коробки с яблоками: " + boxApple.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxOrange.getWeight());
        System.out.println("Вес коробок равен: " + boxApple.compare(boxOrange));

        Box<Orange> boxOrange2 = new Box<>();
        System.out.println("Пересыпать апельсины в новую коробку");
        boxOrange.transfer(boxOrange2);
        System.out.println("В новой коробке " + boxOrange2.getItems().size() + " шт. апельсинов");
//        System.out.println("В старой коробке " + boxOrange.getItems().size() + " шт. апельсинов");
    }
//Метод для задания 1.
    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

}

