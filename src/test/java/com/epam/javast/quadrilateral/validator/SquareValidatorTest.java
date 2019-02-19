package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class SquareValidatorTest {

    private SquareValidator square = new SquareValidator();

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    private Quadrilateral quadrilateral;

    @Test
    public void isSquareTestReturnTrue(){

        pointA = new Point(10 ,20);
        pointB = new Point(20, 20);
        pointC = new Point(10,10);
        pointD = new Point(20,10);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = square.isSquare(quadrilateral);

        Assert.assertTrue(actual);
    }

    @Test
    public void isSquareTestReturnFalse(){

        pointA = new Point(15 ,20);
        pointB = new Point(20, 20);
        pointC = new Point(10,10);
        pointD = new Point(20,10);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = square.isSquare(quadrilateral);

        Assert.assertFalse(actual);
    }
}
