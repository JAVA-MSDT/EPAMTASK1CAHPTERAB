package com.epam.javast.quadrilateral.validator.quadrilateralvalidator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.validator.quadrilateralvalidator.ConvexValidator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConvexValidatorTest {

    private static ConvexValidator convexValidator;
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    @BeforeClass
    public static void init() {
        convexValidator = new ConvexValidator();
    }

    @AfterClass
    public static void close() {
        convexValidator = null;
    }


    @Test
    public void isConvexTestReturnTrue(){
        pointA = new Point(1, 15);
        pointB = new Point(10, 0);
        pointC = new Point(3, 8);
        pointD = new Point(10, 5);

        boolean actual = convexValidator.isConvex(pointA, pointB, pointC, pointD);

        Assert.assertTrue(actual);
    }

    @Test
    public void isConvexTestReturnFalse(){

        pointA = new Point(3, 4);
        pointB = new Point(5, 11);
        pointC = new Point(12, 8);
        pointD = new Point(5, 6);

        boolean actual = convexValidator.isConvex(pointA, pointB, pointC, pointD);

        Assert.assertFalse(actual);
    }
}
