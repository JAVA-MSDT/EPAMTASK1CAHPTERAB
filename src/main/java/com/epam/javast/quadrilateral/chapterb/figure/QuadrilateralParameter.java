package com.epam.javast.quadrilateral.chapterb.figure;

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
}
