package com.epam.javast.quadrilateral.logic.trapezoid;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrapezoidCalculatorTest {

    private static TrapezoidCalculator trapezoidCalculator;

    private static final double DELTA = 0.01;
    private static Point pointA;
    private static  Point pointB;
    private static  Point pointC;
    private static  Point pointD;

    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void init() {
        trapezoidCalculator = new TrapezoidCalculator();

        pointA = new Point(-3,-3);
        pointB = new Point(5, 1);
        pointC = new Point(10,-2);
        pointD = new Point(-4,-9);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
    }

    @AfterClass
    public static void close(){
        trapezoidCalculator = null;

        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        quadrilateral = null;
    }
    @Test
    public void trapezoidAreaCalculatorTestPass(){
        double actual = trapezoidCalculator.areaCalculator(quadrilateral);
        double expected = 0;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void trapezoidAreaCalculatorTestFail(){
        double actual =  trapezoidCalculator.areaCalculator(quadrilateral);
        double expected = 0;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void trapezoidPerimeterCalculatorTestPass(){
        double actual = trapezoidCalculator.perimeterCalculator(quadrilateral);
        double expected = 36.51;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void trapezoidPerimeterCalculatorTestFail(){
        double actual = trapezoidCalculator.perimeterCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
