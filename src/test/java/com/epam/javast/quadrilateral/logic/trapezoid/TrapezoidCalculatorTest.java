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

        pointA = new Point(12,28);
        pointB = new Point(34, 28);
        pointC = new Point(53,7);
        pointD = new Point(6,7);

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
        double expected = 724.50;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void trapezoidAreaCalculatorTestFail(){
        double actual =  trapezoidCalculator.areaCalculator(quadrilateral);
        double expected = 700;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void trapezoidPerimeterCalculatorTestPass(){
        double actual = trapezoidCalculator.perimeterCalculator(quadrilateral);
        double expected = 119.15;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void trapezoidPerimeterCalculatorTestFail(){
        double actual = trapezoidCalculator.perimeterCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
