package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;

/**
 * To check if the shape is a Rhombus gavin four geometric points.
 */
public class RhombusValidator {

    private CalculatorHelper frequentlyUsedFormula = new CalculatorHelper();

    /**
     * Check if the figure is Rhombus or not by checking the distance between the two diagonal of the shape if they are not equals,
     * then checking if each two points that form side of the Rhombus,
     * if the side of the Rhombus are equals so it is a square.
     * @param quadrilateral shape to check if it is a Rhombus
     * @return true if the shape is a square, false if it is not a Rhombus.
     */
    public boolean isRhombus(Quadrilateral quadrilateral) {

        if (quadrilateral == null) {
            return false;
        }

        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        Point pointD = quadrilateral.getPointD();

        double sideAB = frequentlyUsedFormula.distance(pointA, pointB);
        double sideBC = frequentlyUsedFormula.distance(pointB, pointC);
        double sideCD = frequentlyUsedFormula.distance(pointC, pointD);
        double sideDA = frequentlyUsedFormula.distance(pointD, pointA);

        double diagonalAC = frequentlyUsedFormula.distance(pointA, pointC);
        double diagonalBD = frequentlyUsedFormula.distance(pointB, pointD);

        if (diagonalAC != diagonalBD) {
            return sideAB == sideBC && sideBC == sideCD && sideCD == sideDA;
        }

        return false;
    }
}