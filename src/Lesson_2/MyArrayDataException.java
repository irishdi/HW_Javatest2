package Lesson_2;

public class MyArrayDataException extends Exception {
        public int row;
        public int col;

        MyArrayDataException(int row, int col) {
           super(String.format("Неверные данные в ячейке [%d, %d]\n", row, col));
        }

    }
