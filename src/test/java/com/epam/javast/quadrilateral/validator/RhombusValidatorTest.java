package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class RhombusValidatorTest {

    private RhombusValidator rhombus = new RhombusValidator();

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    private Quadrilateral quadrilateral;

    @Test
    public void isRhombusTestReturnTrue(){
         pointA = new Point(5 ,8);
         pointB = new Point(7, 5);
         pointC = new Point(5,2);
         pointD = new Point(3,5);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        boolean actual = rhombus.isRhombus(quadrilateral);

        Assert.assertTrue(actual);
    }

    @Test
    public void isRhombusTestReturnFalse(){
         pointA = new Point(10 ,20);
         pointB = new Point(20, 20);
         pointC = new Point(10,10);
         pointD = new Point(20,10);
        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = rhombus.isRhombus(quadrilateral);

        Assert.assertFalse(actual);
    }
}
