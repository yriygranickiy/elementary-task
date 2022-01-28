package service;

import model.Triangle;

import java.util.*;


public class ImplTriangleService implements TriangleService {

    @Override
    public Triangle createTriangle(String input) {
        Triangle triangle = new Triangle();
        try {
            Map<String, List<Double>> mapTriangles = parsingString(input);
            for (Map.Entry<String, List<Double>> pair : mapTriangles.entrySet()) {
                String nameTriange = pair.getKey();
                List<Double> sidesTriangle = pair.getValue();
                   triangle.setName(nameTriange);
                   triangle.setArea(sidesTriangle.get(0), sidesTriangle.get(1), sidesTriangle.get(2));
            }
        } catch (NumberFormatException numberFormatException) {
            throw new InputMismatchException("Incorrect data !");
        }
        return triangle;
    }

    private Map<String, List<Double>> parsingString(String input) {
        String[] split = input.split(",");
        validateTriangle(split);
        Map<String, List<Double>> resultMap = new HashMap<>();
        List<Double> sidesList = new ArrayList<>();
        String nameTriangle = split[0];
        double firstSide = Double.parseDouble(split[1].trim());
        double secondSide = Double.parseDouble(split[2].trim());
        double thirdSide = Double.parseDouble(split[3].trim());
        sidesList.addAll(Arrays.asList(firstSide, secondSide, thirdSide));
        boolean isNull = firstSide <= 0 || secondSide <= 0 || thirdSide <= 0;
        boolean isNotCorrectTriangle = firstSide + secondSide <= thirdSide
                || firstSide + thirdSide <= secondSide
                || secondSide + thirdSide <= firstSide;
        if (isNull || isNotCorrectTriangle) {
            throw new InputMismatchException("A triangle with such sides cannot be built.");
        }
        resultMap.put(nameTriangle, sidesList);
        return resultMap;
    }

    private boolean validateTriangle(String[] size) {
        if (size.length > 4) {
            throw new InputMismatchException("Incorrect Input");
        }
        return true;
    }
}
