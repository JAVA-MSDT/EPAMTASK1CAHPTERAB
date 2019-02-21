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

    @Override
    public double areaCalculator(Quadrilateral quadrilateral) {
        return 0;
    }


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
