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
        QuadrilateralParameter p = (QuadrilateralParameter) o;
        if (Double.doubleToLongBits(this.perimeter) != Double.doubleToLongBits(p.perimeter)) {
            return false;
        }

        return Double.doubleToLongBits(this.area) == Double.doubleToLongBits(p.area);
    }

     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(area);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "QuadrilateralParameter{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
