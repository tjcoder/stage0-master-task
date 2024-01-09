package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int n1 = number / 100;
        number %= 100;
        int n2 = number / 10;
        number %= 10;
        int n3 = number;

        System.out.println(n3 * 100 + n2 * 10 + n1);
    }

}
