package com.epam.javast.quadrilateral.logic;

import com.epam.javast.quadrilateral.entity.Point;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorHelperTest {

    private static final double DELTA = 0.01;
    private static CalculatorHelper calculatorHelper;
    private static Point pointA;
    private static Point pointB;
    private static Point pointC;


    @BeforeClass
    public static void init() {
        calculatorHelper = new CalculatorHelper();
        pointA = new Point(3, 5);
        pointB = new Point(-1, 1);
    }

    @AfterClass
    public static void close() {
        calculatorHelper = null;
        pointA = null;
        pointB = null;
    }

    @Test
    public void distanceTestPass() {

        int actual = (int) calculatorHelper.distance(pointA, pointB);
        int expected = 5;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void distanceTestFail() {

        int actual = (int) calculatorHelper.distance(pointA, pointB);
        int expected = 4;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void slopeTestPass() {

        int actual = (int) calculatorHelper.slope(pointA, pointB);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void slopeTestFail() {

        int actual = (int) calculatorHelper.slope(pointA, pointB);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void triangleAreaTestPass() {
        pointA = new Point(31, 15);
        pointB = new Point(20, 41);
        pointC = new Point(58, 29);

        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);
        double sideCA = calculatorHelper.distance(pointC, pointA);


        double actual = calculatorHelper.triangleArea(sideAB, sideBC, sideCA);
        double expected = 428;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void triangleAreaTestFail() {
        pointA = new Point(31, 15);
        pointB = new Point(20, 41);
        pointC = new Point(58, 29);

        double sideAB = calculatorHelper.distance(pointA, pointB);
        double sideBC = calculatorHelper.distance(pointB, pointC);
        double sideCA = calculatorHelper.distance(pointC, pointA);


        double actual = calculatorHelper.triangleArea(sideAB, sideBC, sideCA);
        double expected = 430;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
