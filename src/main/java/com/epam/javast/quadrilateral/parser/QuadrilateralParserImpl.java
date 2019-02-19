package com.epam.javast.quadrilateral.parser;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.parser.api.QuadrilateralParser;
import com.epam.javast.quadrilateral.util.regexpackage.FrequentlyUsedRegex;
import com.epam.javast.quadrilateral.validator.ConvexValidator;
import com.epam.javast.quadrilateral.validator.QuadrilateralValidator;

import java.util.ArrayList;
import java.util.List;

public class QuadrilateralParserImpl implements QuadrilateralParser {

    private QuadrilateralValidator quadrilateralValidator = new QuadrilateralValidator();
    private ConvexValidator convexValidator = new ConvexValidator();
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    private Quadrilateral quadrilateral;

    /**
     * To create a list of quadrilateral figures after checking that no 3 points on the same line
     * @param pointList valid point list to form a quadrilateral figure.
     * @return list of quadrilateral figures.
     */
    @Override
    public List<Quadrilateral> quadrilateralParser(List<Point> pointList) {
        if (pointList == null) {
            throw new IllegalArgumentException("not allow for the pointList to be null");
        }
        List<Quadrilateral> quadrilateralList = new ArrayList<>();
        for (List<Point> aPointsList : fourPointList(pointList)) {
            pointA = aPointsList.get(0);
            pointB = aPointsList.get(1);
            pointC = aPointsList.get(2);
            pointD = aPointsList.get(3);

            if((!quadrilateralValidator.isValidQuadrilateral(pointA, pointB, pointC, pointD)) &&
                    (convexValidator.isConvex(pointA, pointB, pointC, pointD))){

                quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
                //quadrilateral.setGeneratedQuadrilateralId();
                quadrilateralList.add(quadrilateral);
            }
        }
        return quadrilateralList;
    }


    /**
     * Helper method to return list of list containing just 4 points which we can use to form a quadrilateral figure
     * we are using it in the quadrilateralParser method.
     * @param pointList valid point list to form a quadrilateral figure.
     * @return list of point list contains of 4 points each list.
     */
    private List<List<Point>> fourPointList(List<Point> pointList) {
        if (pointList == null) {
            throw new IllegalArgumentException("not allow for the pointList to be null");
        }
        List<Point> coordinate = new ArrayList<>();
        List<List<Point>> fourPointsList = new ArrayList<>();

        int counter = 0;
        for (Point point : pointList) {
            coordinate.add(point);
            counter++;
            if (counter == FrequentlyUsedRegex.VALID_ARRAY_POINTS_LENGTH) {
                fourPointsList.add(coordinate);
                coordinate = new ArrayList<>();
                counter = 0;
            }
        }
        return fourPointsList;
    }
}
