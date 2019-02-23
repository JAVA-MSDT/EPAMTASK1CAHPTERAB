package com.epam.javast.quadrilateral.validator.quadrilateralvalidator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;

public class ParallelogramValidator {
    private CalculatorHelper calculatorHelper = new CalculatorHelper();

    /**
     * By checking the distance between the points, Parallelogram has to have each 2 sides in parallel and the same length,
     * also the diagonals length has to not be equal.
     * @param quadrilateral to check it if it is a Parallelogram or not.
     * @return true if it is valid Parallelogram, false iif it is not valid Parallelogram
     */
    public boolean isValidParallelogram(Quadrilateral quadrilateral) {
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

        if (sideAB == sideCD && sideBC == sideDA) {
            return diagonalAC != diagonalBD;
        }

        return false;
    }
}
