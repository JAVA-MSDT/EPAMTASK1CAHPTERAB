package com.epam.javast.quadrilateral.observer;

import com.epam.javast.quadrilateral.entity.QuadrilateralParameter;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.logic.square.SquareCalculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuadrilateralObserverTest {
    private static Point pointA;
    private static Point pointB;
    private static Point pointC;
    private static Point pointD;

    private static QuadrilateralObservable quadrilateral;
    private static QuadrilateralParameter actual;


    @BeforeClass
    public static void init() {
        pointA = new Point(10, 20);
        pointB = new Point(20, 20);
        pointC = new Point(10, 10);
        pointD = new Point(20, 10);

        quadrilateral = new QuadrilateralObservable(pointA, pointB, pointC, pointD);
        quadrilateral.setQuadrilateralId(1);

        QuadrilateralObserver.getInstance().setCalculator(new SquareCalculator());
        QuadrilateralObserver.getInstance().update(quadrilateral);

    }

    @AfterClass
    public static void close(){
        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        quadrilateral = null;
    }

    @Test
    public void updateTest() {

        int quadrilateralParameterMapSize = QuadrilateralObserver.getInstance().getQuadrilateralParameter().size();
        int expected = 1;
        Assert.assertEquals(expected, quadrilateralParameterMapSize);
    }

    @Test
    public void getQuadrilateralParameterByItemIdTestPass() {
        actual = QuadrilateralObserver.getInstance().getQuadrilateralParameterByItemId(quadrilateral.getQuadrilateralId());
        QuadrilateralParameter expected = new QuadrilateralParameter(40.0, 100.0);

        Assert.assertEquals(expected, actual);

    }
}
