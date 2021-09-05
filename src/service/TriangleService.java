package service;

import model.Triangle;

import java.util.InputMismatchException;

public class TriangleService implements TriangleFactory {
    private Triangle triangle;

    @Override
    public Triangle createTriangle(String input) {
        String[] split = input.split(",");
        String name = split[0].trim();
        double firstSide = Double.parseDouble(split[1].trim());
        double secondSide = Double.parseDouble(split[2].trim());
        double thirdSide = Double.parseDouble(split[3].trim());
        try {
            if (firstSide + secondSide <= thirdSide &&
                    firstSide + thirdSide <= secondSide &&
                    secondSide + thirdSide <= firstSide) {
                throw new InputMismatchException("Envelope can`t be build");
            }
            triangle = new Triangle(name,firstSide,secondSide,thirdSide);
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
        return triangle;
    }
}
