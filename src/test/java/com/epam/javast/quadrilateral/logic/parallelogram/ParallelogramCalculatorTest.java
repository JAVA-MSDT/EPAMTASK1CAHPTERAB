package com.epam.javast.quadrilateral.logic.parallelogram;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParallelogramCalculatorTest {

    private static final double DELTA = 0.01;
    private static ParallelogramCalculator parallelogramCalculator;
    private static Point pointA;
    private static Point pointB;
    private static Point pointC;
    private static Point pointD;
    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void init() {
        parallelogramCalculator = new ParallelogramCalculator();

        pointA = new Point(-7 ,5);
        pointB = new Point(6, 5);
        pointC = new Point(4,-2);
        pointD = new Point(-9,-2);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
    }

    @AfterClass
    public static void close(){
        parallelogramCalculator = null;

        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        quadrilateral = null;
    }

    @Test
    public void parallelogramAreaCalculatorTestPass() {
        double actual = parallelogramCalculator.areaCalculator(quadrilateral);
        double expected = 90.99;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void parallelogramAreaCalculatorTestFail() {
        double actual = parallelogramCalculator.areaCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void parallelogramPerimeterCalculatorTestPass() {
        double actual = parallelogramCalculator.perimeterCalculator(quadrilateral);
        double expected = 40.56;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void parallelogramPerimeterCalculatorTestFail() {
        double actual = parallelogramCalculator.perimeterCalculator(quadrilateral);
        double expected = 48;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
