package com.epam.javast.quadrilateral.repository;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.repository.specification.specifiedimpl.SpecifiedByID;
import com.epam.javast.quadrilateral.repository.specification.specifiedimpl.SpecifiedByPoint;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImplTest {
    private static RepositoryImpl repository = new RepositoryImpl();
    private static Point pointA;
    private static Point pointB;
    private static Point pointC;
    private static Point pointD;

    private static Point pointE;
    private static Point pointF;
    private static Point pointG;
    private static Point pointH;

    private static Quadrilateral quadrilateral;
    private static Quadrilateral quadrilateral1;
    private static List<Quadrilateral> quadrilateralList;
    private static List<Quadrilateral> testingList;

    @BeforeClass
    public static void init(){
        repository = new RepositoryImpl();

        pointA = new Point(1, 5);
        pointB = new Point(10, 5);
        pointC = new Point(3, 8);
        pointD = new Point(10, 5);

        pointE = new Point(18, 25);
        pointF = new Point(0, 15);
        pointG = new Point(30, 18);
        pointH = new Point(50, 5);

        quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        quadrilateral.setQuadrilateralId(1);
        quadrilateral1 = new Quadrilateral(pointE, pointF, pointG, pointH);
        quadrilateral1.setQuadrilateralId(2);

        quadrilateralList = new ArrayList<>();
        quadrilateralList.add(quadrilateral);
        quadrilateralList.add(quadrilateral1);

    }
    @AfterClass
    public static void afterClass(){
        repository = new RepositoryImpl();

        pointA = null;
        pointB = null;
        pointC = null;
        pointD = null;

        pointE = null;
        pointF = null;
        pointG = null;
        pointH = null;

        quadrilateral = null;
        quadrilateral1 = null;

        quadrilateralList = null;
    }
    @Test
    public void testAddByOneQuadrilateralAtATimePass(){
        repository.add(quadrilateral);
        repository.add(quadrilateral1);

        List<Quadrilateral> actual = repository.getQuadrilateralList();

        Assert.assertEquals(quadrilateralList, actual);
    }

    @Test
    public void testAddListOfQuadrilateralPass(){
        repository.add(quadrilateralList);

        List<Quadrilateral> actual = repository.getQuadrilateralList();

        Assert.assertEquals(quadrilateralList, actual);
    }

    @Test
    public void testRemoveByQuadrilateralPass(){

        repository.add(quadrilateral);
        repository.add(quadrilateral1);
        repository.remove(quadrilateral);

        List<Quadrilateral> actual = repository.getQuadrilateralList();
        testingList = new ArrayList<>();
        testingList.add(quadrilateral1);

        Assert.assertEquals(testingList, actual);
    }

    @Test
    public void testRemoveBySpecificCriteriaPass(){
        repository.add(quadrilateralList);
        repository.remove(new SpecifiedByID(1));

        testingList = new ArrayList<>();
        testingList.add(quadrilateral1);

        List<Quadrilateral> actual = repository.getQuadrilateralList();

        Assert.assertEquals(testingList, actual);
    }

    @Test
    public void testUpdateOldQuadrilateralByNewQuadrilateralPass(){
        repository.add(quadrilateralList);
        repository.update(quadrilateral, quadrilateral1);

        testingList = new ArrayList<>();
        testingList.add(quadrilateral1);
        testingList.add(quadrilateral1);

        List<Quadrilateral> actual = repository.getQuadrilateralList();

        Assert.assertEquals(testingList, actual);

    }

    @Test
    public void testQueryPass(){

        Point pointTest = new Point(18,25);
        repository.add(quadrilateralList);
        repository.add(quadrilateralList);

        testingList = new ArrayList<>();
        testingList.add(quadrilateral1);
        testingList.add(quadrilateral1);

        List<Quadrilateral> actual = repository.query(new SpecifiedByPoint(pointTest));

        Assert.assertEquals(testingList, actual);
    }

}
