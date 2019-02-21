package com.epam.javast.quadrilateral.logic.square;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.rhombus.RhombusCalculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SquareCalculatorTest {

    private static  SquareCalculator squareCalculator;

    private static final double DELTA = 0.01;
    private static  Point pointA;
    private static  Point pointB;
    private static  Point pointC;
    private static  Point pointD;

    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void init() {
        squareCalculator = new SquareCalculator();

        pointA = new Point(2, 5);
        pointB = new Point(6, 5);
        pointC = new Point(6, 1);
        pointD = new Point(2, 1);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
    }

    @AfterClass
    public static void close(){
        squareCalculator = null;

        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        quadrilateral = null;
    }
    @Test
    public void squareAreaCalculatorTestPass(){
        double actual = squareCalculator.areaCalculator(quadrilateral);
        double expected = 16;

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
        double expected = 16;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void squarePerimeterCalculatorTestFail(){
        double actual = squareCalculator.perimeterCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
