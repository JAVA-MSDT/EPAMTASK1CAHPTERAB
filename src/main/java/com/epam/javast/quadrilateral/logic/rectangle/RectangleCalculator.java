package com.epam.javast.quadrilateral.logic.rectangle;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;
import com.epam.javast.quadrilateral.logic.api.Calculator;

public class RectangleCalculator implements Calculator {
    private CalculatorHelper calculatorHelper = new CalculatorHelper();

    @Override
    public String getFigureName() {
        return "Rectangle";
    }

    /**
     * @param quadrilateral to calculate it is area as a Rectangle
     * @return area of a Rectangle
     */
    @Override
    public double areaCalculator(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("Rectangle Quadrilateral not allow to be null");
        }
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);

        return sideAB * sideBC;
    }

    /**
     *
     * @param quadrilateral to calculate it is Perimeter as a Rectangle
     * @return Perimeter of a Rectangle
     */
    @Override
    public double perimeterCalculator(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("Rectangle Quadrilateral not allow to be null");
        }
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);

        return 2 * (sideAB + sideBC);
    }
}
