package com.epam.javast.quadrilateral.parser;

import com.epam.javast.quadrilateral.entity.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointParserImplTest {

    private static final PointParserImpl pointParser = new PointParserImpl();
    private static final List<String> stringList = Arrays.asList("1,5 2,3 4,5 6,4",
            "1,a b,5 5,5 -4,3");

    @Test
    public void pointParserTestPass(){
        List<Point> actual = pointParser.pointParser(stringList);
        List<Point> expected = new ArrayList<>();

        expected.add(new Point(1,5));
        expected.add(new Point(2,3));
        expected.add(new Point(4,5));
        expected.add(new Point(6,4));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void pointParserTestFail(){
        List<Point> actual = pointParser.pointParser(stringList);
        List<Point> expected = new ArrayList<>();

        expected.add(new Point(1,5));
        expected.add(new Point(2,3));
        expected.add(new Point(4,5));
        expected.add(new Point(6,4));
        expected.add(new Point(0,8));

        Assert.assertEquals(expected, actual);

    }
}
