package com.epam.javast.quadrilateral.observer;

import com.epam.javast.quadrilateral.entity.QuadrilateralParameter;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.logic.square.SquareCalculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuadrilateralObservableTest {

    private static Point pointA;
    private static Point pointB;
    private static Point pointC;
    private static Point pointD;

    private static QuadrilateralObservable quadrilateral;


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

    /**
     * Test will fail if the notify works and the.
     * comment quadrilateral.addObserver(QuadrilateralObserver.getInstance()); to check the results
     */
    @Test
    public void returnFalseIfTheUpdateNotifyWorks(){
        quadrilateral.addObserver(QuadrilateralObserver.getInstance());
        QuadrilateralParameter parameter = QuadrilateralObserver.getInstance().getQuadrilateralParameterByItemId(quadrilateral.getQuadrilateralId());

        quadrilateral.setPointA(new Point(100, 200));
        quadrilateral.setPointB(new Point(200,200));
        quadrilateral.setPointC(new Point(100, 100));
        quadrilateral.setPointD(new Point(200,100));

        QuadrilateralParameter parameter1 = QuadrilateralObserver.getInstance().getQuadrilateralParameterByItemId(quadrilateral.getQuadrilateralId());

        Assert.assertEquals(parameter, parameter1);

    }
}
