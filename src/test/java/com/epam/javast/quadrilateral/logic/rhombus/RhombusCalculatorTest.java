package com.epam.javast.quadrilateral.logic.rhombus;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class RhombusCalculatorTest {

    private static final RhombusCalculator rhombusCalculator = new RhombusCalculator();

    private static final Point pointA = new Point(5 ,8);
    private static final Point pointB = new Point(7, 5);
    private static final Point pointC = new Point(5,2);
    private static final Point pointD = new Point(3,5);

    private Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

    @Test
    public void rhombusAreaCalculatorTestPass(){
        double actual = rhombusCalculator.areaCalculator(quadrilateral);
        double expected = 12;

        Assert.assertEquals(expected, actual,0.01);

    }

    @Test
    public void rhombusAreaCalculatorTestFail(){
        double actual =  rhombusCalculator.areaCalculator(quadrilateral);
        double expected = 10;

        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void rhombusPerimeterCalculatorTestPass(){
        double actual = rhombusCalculator.perimeterCalculator(quadrilateral);
        double expected = 14.42;

        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void rhombusPerimeterCalculatorTestFail(){
        double actual =  rhombusCalculator.perimeterCalculator(quadrilateral);
        double expected = 100;

        Assert.assertEquals(expected, actual,0.01);

    }
}
