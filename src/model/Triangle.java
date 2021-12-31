package model;

import java.util.Objects;

public class Triangle implements Comparable<Triangle> {

    private String name;
    private double area;

    public Triangle() {
    }


    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double firstSide,double secondSide, double thridSide) {
        double perimetr = (firstSide+ secondSide+thridSide)/2;
        this.area = Math.sqrt(perimetr*(perimetr-firstSide)*(perimetr - secondSide)*(perimetr - thridSide));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.area, area) == 0 && Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }

    @Override
    public String toString() {
        return name + " : " + area;
    }

    @Override
    public int compareTo(Triangle triangle) {
        return Double.compare(triangle.area, this.area);
    }
}
