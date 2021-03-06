package com.epam.javast.quadrilateral.logic.parallelogram;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;
import com.epam.javast.quadrilateral.logic.api.Calculator;

public class ParallelogramCalculator implements Calculator {
    private CalculatorHelper calculatorHelper = new CalculatorHelper();
    @Override
    public String getFigureName() {
        return "Parallelogram";
    }

    /**
     * calculating the are of a Parallelogram by dividing the Parallelogram into 2 triangle, calculating the are of each
     * triangle separately then adding them together to get the area of the Parallelogram.
     * @param quadrilateral to calculate it is area as a Parallelogram
     * @return area of a Parallelogram
     */
    @Override
    public double areaCalculator(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("Parallelogram Quadrilateral not allow to be null");
        }
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
     *
     * @param quadrilateral to calculate it is perimeter as a Parallelogram
     * @return perimeter of a Parallelogram
     */
    @Override
    public double perimeterCalculator(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("Parallelogram Quadrilateral not allow to be null");
        }
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);

        return 2 * (sideAB + sideBC);
    }
}
