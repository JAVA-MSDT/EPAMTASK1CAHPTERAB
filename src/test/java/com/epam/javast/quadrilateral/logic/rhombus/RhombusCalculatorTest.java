package com.epam.javast.quadrilateral.logic.rhombus;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.*;

public class RhombusCalculatorTest {

    private static final double DELTA = 0.01;
    private static RhombusCalculator rhombusCalculator;
    private static Point pointA;
    private static Point pointB;
    private static Point pointC;
    private static Point pointD;
    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void init() {
        rhombusCalculator = new RhombusCalculator();

        pointA = new Point(5, 8);
        pointB = new Point(7, 5);
        pointC = new Point(5, 2);
        pointD = new Point(3, 5);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
    }

    @AfterClass
    public static void close(){
        rhombusCalculator = null;

        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        quadrilateral = null;
    }

    @Test
    public void rhombusAreaCalculatorTestPass() {
        double actual = rhombusCalculator.areaCalculator(quadrilateral);
        double expected = 12;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void rhombusAreaCalculatorTestFail() {
        double actual = rhombusCalculator.areaCalculator(quadrilateral);
        double expected = 10;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void rhombusPerimeterCalculatorTestPass() {
        double actual = rhombusCalculator.perimeterCalculator(quadrilateral);
        double expected = 14.42;

        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void rhombusPerimeterCalculatorTestFail() {
        double actual = rhombusCalculator.perimeterCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual, DELTA);

    }
}
