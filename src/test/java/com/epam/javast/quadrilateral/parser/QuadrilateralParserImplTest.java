package com.epam.javast.quadrilateral.parser;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrilateralParserImplTest {

    private QuadrilateralParserImpl quadrilateralParser = new QuadrilateralParserImpl();

    private Point pointA = new Point(1, 5);
    private Point pointB = new Point(2, 3);
    private Point pointC = new Point(4, 5);
    private Point pointD = new Point(6, 4);

    private Point pointE = new Point(10, 20);
    private Point pointF = new Point(20, 20);
    private Point pointG = new Point(10, 10);
    private Point pointH = new Point(20, 10);

    private Point pointI = new Point(3, 4);
    private Point pointJ = new Point(5, 11);
    private Point pointK = new Point(12, 8);
    private Point pointL = new Point(5, 6);

    private Quadrilateral quadrilateralA = new Quadrilateral(pointA, pointB, pointC, pointD);
    private Quadrilateral quadrilateralB = new Quadrilateral(pointE, pointF, pointG, pointH);
    private Quadrilateral quadrilateralC = new Quadrilateral(pointI, pointJ, pointK, pointL);


@Test
    public void quadrilateralParserTestPass() {
        List<Point> pointList = new ArrayList<>();

        pointList.add(pointA);
        pointList.add(pointB);
        pointList.add(pointC);
        pointList.add(pointD);

        pointList.add(pointE);
        pointList.add(pointF);
        pointList.add(pointG);
        pointList.add(pointH);

        pointList.add(pointI);
        pointList.add(pointJ);
        pointList.add(pointK);
        pointList.add(pointL);

        List<Quadrilateral> actual = quadrilateralParser.quadrilateralParser(pointList);
        List<Quadrilateral> expected = Arrays.asList(quadrilateralA, quadrilateralB);

        Assert.assertEquals(expected, actual);


    }
}
