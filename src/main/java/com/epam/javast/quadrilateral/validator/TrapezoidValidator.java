package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;

public class TrapezoidValidator {

    private CalculatorHelper frequentlyUsedFormula = new CalculatorHelper();

    /**
     * Check if the figure is a Trapezoid or not .
     * @param quadrilateral shape to check if it is a Trapezoid
     * @return true if the shape is a Trapezoid, false if it is not a Trapezoid.
     */
    public boolean isTrapezoid(Quadrilateral quadrilateral) {
        if (quadrilateral == null) {
            return false;
        }

        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        Point pointD = quadrilateral.getPointD();

        double sideAB = frequentlyUsedFormula.slope(pointA, pointB);
        double sideBC = frequentlyUsedFormula.slope(pointB, pointC);
        double sideCD = frequentlyUsedFormula.slope(pointC, pointD);
        double sideDA = frequentlyUsedFormula.slope(pointD, pointA);

        if(sideAB == sideCD && sideBC != sideDA){
            return true;
        }

        return sideBC == sideDA && sideAB != sideCD;
    }
}
