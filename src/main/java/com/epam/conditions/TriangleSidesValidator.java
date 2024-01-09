package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean possible1 = firstSide + secondSide > thirdSide;
        boolean possible2 = firstSide + thirdSide > secondSide;
        boolean possible3 = thirdSide + secondSide > firstSide;

        if (possible1 && possible2 && possible3) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
