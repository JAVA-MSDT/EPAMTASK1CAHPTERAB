package com.epam.javast.quadrilateral.logic.square;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;
import com.epam.javast.quadrilateral.validator.SquareValidator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * SquareCalculator class implementing AreaCalculator interface.
 * we have here only one method is to calculate the are of a Square according to the side formula
 * ( area = sideLength ^ 2 )
 */
public class SquareCalculator implements Calculator {

    private Logger logger = LogManager.getLogger(SquareCalculator.class);
    private SquareValidator square = new SquareValidator();
    private CalculatorHelper frequentlyUsedFormula = new CalculatorHelper();

    /**
     *
     * @param quadrilateral that we need to calculate is area after checking
     *                      that the shape is a Square.
     * @return area of Square or 0 if the shape is not Square.
     */
    @Override
    public double areaCalculator(Quadrilateral quadrilateral) {

        if(quadrilateral == null){
            logger.log(Level.INFO, "Not allow for a null value");
        }

        double area = 0;
        Point pointA = quadrilateral.getPointA();
        Point pointB = quadrilateral.getPointB();

        double sideLength = frequentlyUsedFormula.distance(pointA, pointB);

        if(square.isSquare(quadrilateral)){

          area = Math.pow(sideLength, 2);
        }

        return area;
    }

    /**
     *
     * @param quadrilateral that we need to calculate is perimeter after checking
     *                      that the shape is a Square.
     * @return perimeter of a Square or 0 if the shape is not Square.
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

        if(square.isSquare(quadrilateral)){

            perimeter = 4 * sideLength;
        }

        return perimeter;
    }
}
