package com.epam.javast.quadrilateral.logic.rectangle;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleCalculatorTest {

    private static final double DELTA = 0.01;
    private static RectangleCalculator rectangleCalculator;
    private static Point pointA;
    private static Point pointB;
    private static Point pointC;
    private static Point pointD;
    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void init() {
        rectangleCalculator = new RectangleCalculator();

        pointA = new Point(-5 ,1);
        pointB = new Point(1, 1);
        pointC = new Point(1,-3);
        pointD = new Point(-5,-3);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
    }

    @AfterClass
    public static void close(){
        rectangleCalculator = null;

        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        quadrilateral = null;
    }

    @Test
    public void rectangleAreaCalculatorTestPass() {
        double actual = rectangleCalculator.areaCalculator(quadrilateral);
        double expected = 24;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void rectangleAreaCalculatorTestFail() {
        double actual = rectangleCalculator.areaCalculator(quadrilateral);
        double expected = 10;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void rectanglePerimeterCalculatorTestPass() {
        double actual = rectangleCalculator.perimeterCalculator(quadrilateral);
        double expected = 20;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void rectanglePerimeterCalculatorTestFail() {
        double actual = rectangleCalculator.perimeterCalculator(quadrilateral);
        double expected = 48;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
