package com.epam.javast.quadrilateral.validator.quadrilateralvalidator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class RectangleValidatorTest {
    private RectangleValidator rectangle = new RectangleValidator();

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    private Quadrilateral quadrilateral;

    @Test
    public void isValidRectangleReturnTrue(){

        pointA = new Point(-5 ,1);
        pointB = new Point(1, 1);
        pointC = new Point(1,-3);
        pointD = new Point(-5,-3);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = rectangle.isValidRectangle(quadrilateral);

        Assert.assertTrue(actual);
    }

    @Test
    public void isValidRectangleReturnFalse(){

        pointA = new Point(-7 ,5);
        pointB = new Point(6, 5);
        pointC = new Point(4,-2);
        pointD = new Point(-9,-2);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = rectangle.isValidRectangle(quadrilateral);

        Assert.assertFalse(actual);
    }
}
