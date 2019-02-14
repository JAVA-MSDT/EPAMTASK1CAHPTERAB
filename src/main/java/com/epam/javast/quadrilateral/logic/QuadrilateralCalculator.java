package com.epam.javast.quadrilateral.logic;

import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;

/**
 * QuadrilateralCalculator has only 2 methods AreaCalculator and PerimeterCalculator.
 */
public class QuadrilateralCalculator {

   private Quadrilateral quadrilateral;
   private Calculator calculator;

    public QuadrilateralCalculator() {
    }

    public QuadrilateralCalculator(Quadrilateral quadrilateral, Calculator calculator) {
        this.quadrilateral = quadrilateral;
        this.calculator = calculator;
    }

    public Quadrilateral getQuadrilateral() {
        return quadrilateral;
    }

    public void setQuadrilateral(Quadrilateral quadrilateral) {
        this.quadrilateral = quadrilateral;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    /**
     * @return area of the shape which we already determined by the interface reference areaCalculator
     */
    public double areaCalculator() {
        return calculator.areaCalculator(quadrilateral);
    }

    /**
     * @return perimeter of the shape which we already determined by the interface reference areaCalculator
     */
    public double perimeterCalculator() {
        return calculator.perimeterCalculator(quadrilateral);
    }
}
