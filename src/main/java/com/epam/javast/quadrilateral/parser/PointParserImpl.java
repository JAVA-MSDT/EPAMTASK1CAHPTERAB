package com.epam.javast.quadrilateral.parser;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.parser.api.PointParser;
import com.epam.javast.quadrilateral.util.regexpackage.FrequentlyUsedRegex;
import com.epam.javast.quadrilateral.validator.PointValidator;

import java.util.ArrayList;
import java.util.List;

public class PointParserImpl implements PointParser {

    private PointValidator pointValidator = new PointValidator();

    /**
     * to parse the list of point List into list of point object.
     *
     * @param listOfPoints to parse into list of point object
     * @return list of valid point object
     */
    @Override
    public List<Point> pointParser(List<String> listOfPoints) {
        if (listOfPoints == null) {
            throw new IllegalArgumentException("not allow for the list of points to be null");
        }
        List<Point> pointList = new ArrayList<>();

        for (String points : listOfPoints) {
            points = points.trim();
            String[] arrayOfPoints = points.split(FrequentlyUsedRegex.WHITE_SPACE);
            if (pointValidator.isValidPoint(arrayOfPoints)) {
                pointList.addAll(pointCreator(arrayOfPoints));
            }
        }
        return pointList;
    }

    /**
     * helper method to clean the code inside  method (pointParser)
     *
     * @param listOfPoints that is already valid
     * @return list of points
     */
    private List<Point> pointCreator(String[] listOfPoints) {
        if (listOfPoints == null) {
            throw new IllegalArgumentException("not allow for the list of points to be null");
        }
        List<Point> pointList = new ArrayList<>();
        for (String arrayOfPoint : listOfPoints) {
            int delimiter = arrayOfPoint.indexOf(FrequentlyUsedRegex.COMMA_SEPARATOR);
            int x = Integer.parseInt(arrayOfPoint.substring(FrequentlyUsedRegex.INDEX_ZERO, delimiter));
            int y = Integer.parseInt(arrayOfPoint.substring(delimiter + FrequentlyUsedRegex.NEXT_INDEX));
            Point point = new Point(x, y);
            pointList.add(point);
        }
        return pointList;
    }
}
