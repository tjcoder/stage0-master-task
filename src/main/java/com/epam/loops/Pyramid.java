package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String startPoint = " ".repeat(cathetusLength - i);
            System.out.print(startPoint);

            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }

            System.out.print(1);

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
