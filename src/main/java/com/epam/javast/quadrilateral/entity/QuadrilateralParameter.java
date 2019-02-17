package com.epam.javast.quadrilateral.entity;

import java.util.Objects;

public class QuadrilateralParameter {
    private final double perimeter;
    private final double area;

    public QuadrilateralParameter(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        QuadrilateralParameter parameter = (QuadrilateralParameter) o;

        return Double.compare(parameter.perimeter, perimeter) == 0 &&
                Double.compare(parameter.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(perimeter, area);
    }

    @Override
    public String toString() {
        return "QuadrilateralParameter{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
