package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;

public class ThreePointsOnSameLineValidator {

    /**
     *
     * @param pointA coordinate 1
     * @param pointB coordinate 2
     * @param pointC coordinate 3
     * @return true if 3 points are on the same line, false if they are on a different location
     */
    public boolean isThreePointsOnSameLine(Point pointA, Point pointB, Point pointC) {

        if(pointA == null || pointB == null || pointC == null){
            return false;
        }

        int x1 = pointA.getCoordinateX();
        int y1 = pointA.getCoordinateY();

        int x2 = pointB.getCoordinateX();
        int y2 = pointB.getCoordinateY();

        int x3 = pointC.getCoordinateX();
        int y3 = pointC.getCoordinateY();


        return ((y3 - y2) * (x2 - x1) == (y2 - y1) * (x3 - x2));
    }

}
