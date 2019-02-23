package com.epam.javast.quadrilateral.logic.trapezoid;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;
import com.epam.javast.quadrilateral.logic.api.Calculator;

public class TrapezoidCalculator implements Calculator {

    private CalculatorHelper calculatorHelper = new CalculatorHelper();
    public String getFigureName(){
        return "Trapezoid";
    }

    /**
     * calculating the are of a Trapezoid by dividing the Trapezoid into 2 triangle, calculating the are of each
     * triangle separately then adding them together to get the area of the Trapezoid.
     * @param quadrilateral to calculate it is area as a Trapezoid
     * @return area of a Trapezoid
     */
    @Override
    public double areaCalculator(Quadrilateral quadrilateral) {
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        Point pointD = quadrilateral.getPointD();

        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);
        double sideCD = calculatorHelper.distance(pointC, pointD);
        double sideDA = calculatorHelper.distance(pointD, pointA);

        double diagonalAC = calculatorHelper.distance(pointA, pointC);

        double firstTriangleArea = calculatorHelper.triangleArea(sideAB, sideBC, diagonalAC);
        double secondTriangleArea = calculatorHelper.triangleArea(sideCD, sideDA, diagonalAC);

        return firstTriangleArea + secondTriangleArea;
    }

    /**
     * @param quadrilateral to calculate it is perimeter as a Trapezoid
     * @return perimeter of a Trapezoid
     */
    @Override
    public double perimeterCalculator(Quadrilateral quadrilateral) {
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        Point pointD = quadrilateral.getPointD();

        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);
        double sideCD = calculatorHelper.distance(pointC, pointD);
        double sideDA = calculatorHelper.distance(pointD, pointA);

        return sideAB + sideBC + sideCD + sideDA;
    }
}
