package com.company;

public class Main {

    public static void main(String[] args) {

        int month = 3;

        if ((month > 0 && month <= 2) || month == 12)
            System.out.println("Зима");
        else if (month >= 3 && month <= 5)
            System.out.println("Весна");
        else if (month >= 6 && month <= 8)
            System.out.println("Лето");
        else
            System.out.println("Осень");

        switch (month) {
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Осень");
                break;
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 0;
        squareArray[0][1] = 1;
        squareArray[0][2] = 2;
        squareArray[1][0] = 10;
        squareArray[1][1] = 11;
        squareArray[1][2] = 12;

        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "[" + i + "][" + j + "] ");
            }
            System.out.println();
        }


    }
}
