package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class ThreePointsOnSameLineValidatorTest {

    ThreePointsOnSameLineValidator threePointsOnSameLineValidator = new ThreePointsOnSameLineValidator();

    @Test
    public void returnTrueIfThreePointsOnSameLine(){
        Point pointA = new Point(1, 5);
        Point pointB = new Point(1, 6);
        Point pointC = new Point(1, -4);
        boolean actual = threePointsOnSameLineValidator.isThreePointsOnSameLine(pointA, pointB, pointC);
        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void returnFalseIfThreePointsNotOnSameLine(){
        Point pointA = new Point(1, 1);
        Point pointB = new Point(1, 6);
        Point pointC = new Point(0, 9);
        boolean actual = threePointsOnSameLineValidator.isThreePointsOnSameLine(pointA, pointB, pointC);
        boolean expected = false;

        Assert.assertEquals(actual, expected);
    }
}
