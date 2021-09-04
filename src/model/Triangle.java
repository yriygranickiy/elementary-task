package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Triangle {
    private String name;
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double area;

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        this.name = name;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        double square = (firstSide + secondSide + thirdSide)/2;
        area =Math.sqrt(square * (square - firstSide) * (square - secondSide) * (square - thirdSide));
    }

    public double getArea() {
        return area;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.firstSide, firstSide) == 0
                && Double.compare(triangle.secondSide, secondSide) == 0
                && Double.compare(triangle.thirdSide, thirdSide) == 0
                && Double.compare(triangle.area, area) == 0
                && Objects.equals(name, triangle.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, firstSide, secondSide, thirdSide, area);
    }

    @Override
    public String toString() {
        return
                "Name : " + name + "\t" +
                "Area : " + area ;
    }
}
