package com.epam.javast.quadrilateral.logic;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.logic.CalculatorHelper;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorHelperTest {

    private CalculatorHelper frequentlyUsedFormula = new CalculatorHelper();
    private Point pointA = new Point(3,5);
    private Point pointB = new Point(-1, 1);

    @Test
    public void distanceTestPass(){

        int actual = (int)frequentlyUsedFormula.distance(pointA, pointB);
        int expected = 5;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void distanceTestFail(){

        int actual = (int)frequentlyUsedFormula.distance(pointA, pointB);
        int expected = 4;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void slopeTestPass(){

        int actual =(int) frequentlyUsedFormula.slope(pointA, pointB);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void slopeTestFail(){

        int actual =(int) frequentlyUsedFormula.slope(pointA, pointB);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }
}
