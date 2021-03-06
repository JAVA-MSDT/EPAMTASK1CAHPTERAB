package com.epam.javast.quadrilateral.validator.quadrilateralvalidator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;

/**
 * To check if the shape is a square gavin four geometric points.
 */
public class SquareValidator {

    private CalculatorHelper calculatorHelper = new CalculatorHelper();

    /**
     * Check if the figure is a square or not by checking the distance between the two diagonal of the shape if they are equals.
     * @param quadrilateral shape to check if it is a square
     * @return true if the shape is a square, false if it is not a square.
     */
    public boolean isSquare(Quadrilateral quadrilateral){

        if (quadrilateral == null) {
            return false;
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
        double diagonalBD = calculatorHelper.distance(pointB, pointD);

        if (diagonalAC == diagonalBD) {
            return sideAB == sideBC && sideBC == sideCD && sideCD == sideDA;
        }

        return false;
    }

}
