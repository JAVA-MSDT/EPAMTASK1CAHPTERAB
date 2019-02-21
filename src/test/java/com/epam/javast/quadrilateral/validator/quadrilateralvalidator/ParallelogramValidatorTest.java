package com.epam.javast.quadrilateral.validator.quadrilateralvalidator;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class ParallelogramValidatorTest {
    private ParallelogramValidator parallelogram = new ParallelogramValidator();

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    private Quadrilateral quadrilateral;

    @Test
    public void isValidParallelogramReturnTrue(){

        pointA = new Point(-7 ,5);
        pointB = new Point(6, 5);
        pointC = new Point(4,-2);
        pointD = new Point(-9,-2);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = parallelogram.isValidParallelogram(quadrilateral);

        Assert.assertTrue(actual);
    }

    @Test
    public void isValidParallelogramReturnFalse(){

        pointA = new Point(20 ,10);
        pointB = new Point(20, 20);
        pointC = new Point(10,20);
        pointD = new Point(10,10);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        boolean actual = parallelogram.isValidParallelogram(quadrilateral);

        Assert.assertFalse(actual);
    }
}
