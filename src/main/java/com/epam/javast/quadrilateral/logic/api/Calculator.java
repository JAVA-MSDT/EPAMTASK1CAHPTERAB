package com.epam.javast.quadrilateral.logic.api;

public interface Calculator extends AreaCalculator, PerimeterCalculator {
    String getFigureName();
}