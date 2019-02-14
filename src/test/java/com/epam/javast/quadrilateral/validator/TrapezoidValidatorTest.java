package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class TrapezoidValidatorTest {

    private TrapezoidValidator trapezoid = new TrapezoidValidator();
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    private Quadrilateral quadrilateral;

    @Test
    public void isTrapezoidTestPass(){

        pointA = new Point(-3,-3);
        pointB = new Point(5, 1);
        pointC = new Point(10,-2);
        pointD = new Point(-4,-9);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = trapezoid.isTrapezoid(quadrilateral);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTrapezoidTestFail(){

        pointA = new Point(-10,-3);
        pointB = new Point(5, 51);
        pointC = new Point(10,-2);
        pointD = new Point(-4,-9);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = trapezoid.isTrapezoid(quadrilateral);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }
}
