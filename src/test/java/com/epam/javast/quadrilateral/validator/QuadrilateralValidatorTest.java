package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralValidatorTest {

    private static final QuadrilateralValidator validator = new QuadrilateralValidator();

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    @Test
    public void isValidQuadrilateralTestPass(){
         pointA = new Point(1, 5);
         pointB = new Point(10, 5);
         pointC = new Point(3, 8);
         pointD = new Point(10, 5);

         boolean actual = validator.isValidQuadrilateral(pointA, pointB, pointC, pointD);
         boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidQuadrilateralTestFail(){
        pointA = new Point(1, 15);
        pointB = new Point(10, 0);
        pointC = new Point(3, 8);
        pointD = new Point(10, 5);

        boolean actual = validator.isValidQuadrilateral(pointA, pointB, pointC, pointD);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }
}