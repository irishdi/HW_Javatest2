package Lesson_2;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        String[][] array = {
                {"8", "4", "1", "3"},
                {"1", "4", "1", "9"},
                {"2", "6", "2", "7"},
                {"4", "5", "1", "3"},

        };
        String[][] anotherArray = {
                {"8", "4", "1", "3"},
                {"1", "4", "1"},
                {"2", "6", "2", "7"},
                {"4", "5", "1", "2"},
        };

        String[][] charArray = {
                {"8", "4", "9", "3"},
                {"5", "4", "1", "9"},
                {"2", "6", "2", "7"},
                {"4", "5", "G", "3"},
        };

        try {
            System.out.println("Массив 1:");
            System.out.print(Arrays.deepToString(array) + "\n");
            System.out.println("Сумма элементов массива:" + method(array) + "\n");
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Массив 2:");
            System.out.print(Arrays.deepToString(anotherArray) + "\n");
            System.out.println("Сумма элементов массива:" + method(anotherArray) + "\n");
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Массив 3:");
            System.out.print(Arrays.deepToString(charArray) + "\n");
            System.out.println("Сумма элементов массива:" + method(charArray) + "\n");
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int  method(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int sum =0;
            for (int i=0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    if (array[i].length !=4) throw new MyArraySizeException();
                    try{
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return sum;
        }
    }