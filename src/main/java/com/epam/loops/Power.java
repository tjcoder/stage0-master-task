package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int powResult = 1;
        for (int i = 0; i < power; i++) {
            powResult *= numberToPrint;
        }

        System.out.println(powResult);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
