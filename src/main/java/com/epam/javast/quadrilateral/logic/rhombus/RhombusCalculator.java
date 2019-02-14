package com.epam.javast.quadrilateral.logic.rhombus;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;
import com.epam.javast.quadrilateral.validator.RhombusValidator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * RhombusCalculator class implementing AreaCalculator interface.
 * we have here only one method is to calculate the are of a Rhombus according to the diagonals formula
 * ( 0.5 * (product of the diagonals))
 */
public class RhombusCalculator implements Calculator {

    private Logger logger = LogManager.getLogger(RhombusCalculator.class);
    private RhombusValidator rhombusValidator = new RhombusValidator();
    private CalculatorHelper frequentlyUsedFormula = new CalculatorHelper();

    /**
     *
     * @param quadrilateral that we need to calculate is area after checking
     *                      that the shape is Rhombus.
     * @return area of Rhombus or 0 if the shape is not Rhombus.
     */
    @Override
    public double areaCalculator(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("");
        }
        double area = 0;
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();
        Point pointC = quadrilateral.getPointC();
        Point pointD = quadrilateral.getPointD();

        if(rhombusValidator.isRhombus(quadrilateral)){
            double diagonalAC = frequentlyUsedFormula.distance(pointA, pointC);
            double diagonalBD = frequentlyUsedFormula.distance(pointB, pointD);
            area = 0.5 * (diagonalAC * diagonalBD);
        }

        return area;
    }

    /**
     *
     * @param quadrilateral that we need to calculate is perimeter after checking
     *                      that the shape is a Rhombus.
     * @return perimeter of a Rhombus or 0 if the shape is not Rhombus.
     */
    @Override
    public double perimeterCalculator(Quadrilateral quadrilateral) {

        if(quadrilateral == null){
            logger.log(Level.INFO, "Not allow for a null value");
        }

        double perimeter = 0;
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();

        double sideLength = frequentlyUsedFormula.distance(pointA, pointB);

        if(rhombusValidator.isRhombus(quadrilateral)){

            perimeter = 4 * sideLength;
        }

        return perimeter;
    }
}
