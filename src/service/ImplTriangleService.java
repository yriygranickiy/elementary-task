package service;

import model.Triangle;

import java.util.InputMismatchException;


public class ImplTriangleService implements TriangleService {

    @Override
    public Triangle createTriangle(String input) {
        Triangle triangle;
        try {
            triangle = parsingString(input);
            if(Double.isNaN(triangle.getArea())){
                throw new InputMismatchException("A triangle with such sides cannot be built.");
            }
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Incorrect data");
        }
        return triangle;
    }

    private Triangle parsingString(String input) {
        String[] split = input.split(",");
        String name = split[0].trim();
        double firstSide = Double.parseDouble(split[1].trim());
        double secondSide = Double.parseDouble(split[2].trim());
        double thirdSide = Double.parseDouble(split[3].trim());
        return new Triangle(name, firstSide, secondSide, thirdSide);
    }
}
