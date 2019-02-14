package com.epam.javast.quadrilateral.logic.square;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class SquareCalculatorTest {

    private static final SquareCalculator squareCalculator = new SquareCalculator();

    private static final double DELTA = 0.01;
    private static final Point pointA = new Point(10,20);
    private static final Point pointB = new Point(20,20);
    private static final Point pointC = new Point(10,10);
    private static final Point pointD = new Point(20,10);

    private Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

    @Test
    public void squareAreaCalculatorTestPass(){
        double actual = squareCalculator.areaCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void squareAreaCalculatorTestFail(){
        double actual =  squareCalculator.areaCalculator(quadrilateral);
        double expected = 10;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void squarePerimeterCalculatorTestPass(){
        double actual = squareCalculator.perimeterCalculator(quadrilateral);
        double expected = 40;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void squarePerimeterCalculatorTestFail(){
        double actual = squareCalculator.perimeterCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
