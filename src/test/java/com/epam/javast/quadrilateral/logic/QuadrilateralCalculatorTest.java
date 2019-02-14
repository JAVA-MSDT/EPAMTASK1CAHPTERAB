package com.epam.javast.quadrilateral.logic;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.rhombus.RhombusCalculator;
import com.epam.javast.quadrilateral.logic.square.SquareCalculator;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralCalculatorTest {

    private static final double DELTA = 0.01;

    @Test
    public void areaCalculatorForSquareTestPass(){

         Point pointA = new Point(10,20);
         Point pointB = new Point(20,20);
         Point pointC = new Point(10,10);
         Point pointD = new Point(20,10);

        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        QuadrilateralCalculator calculator = new QuadrilateralCalculator(quadrilateral, new SquareCalculator());

        double actual = calculator.areaCalculator();
        double expected = 100;

        Assert.assertEquals(expected,actual,DELTA);

    }

    @Test
    public void areaCalculatorForRhombusTestPass(){

         Point pointA = new Point(5 ,8);
         Point pointB = new Point(7, 5);
         Point pointC = new Point(5,2);
         Point pointD = new Point(3,5);

        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        QuadrilateralCalculator calculator = new QuadrilateralCalculator(quadrilateral, new RhombusCalculator());

        double actual = calculator.areaCalculator();
        double expected = 12;

        Assert.assertEquals(expected,actual,DELTA);

    }

    @Test
    public void perimeterCalculatorForSquareTestPass(){

        Point pointA = new Point(10,20);
        Point pointB = new Point(20,20);
        Point pointC = new Point(10,10);
        Point pointD = new Point(20,10);

        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        QuadrilateralCalculator calculator = new QuadrilateralCalculator(quadrilateral, new SquareCalculator());

        double actual = calculator.perimeterCalculator();
        double expected = 40;

        Assert.assertEquals(expected,actual,DELTA);

    }

    @Test
    public void perimeterCalculatorForRhombusTest(){

        Point pointA = new Point(5 ,8);
        Point pointB = new Point(7, 5);
        Point pointC = new Point(5,2);
        Point pointD = new Point(3,5);

        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        QuadrilateralCalculator calculator = new QuadrilateralCalculator(quadrilateral, new RhombusCalculator());

        double actual = calculator.perimeterCalculator();
        double expected = 14.42;

        Assert.assertEquals(expected,actual,DELTA);

    }
}
