package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.entity.Point;

public class ConvexValidator {


    /**
     * @param pointA on the plan contains coordinate x and y.
     * @param pointB on the plan contains coordinate x and y.
     * @param pointC on the plan contains coordinate x and y.
     * @return 1 if pointA-pointB-pointC is a counterclockwise turn, -1 for clockwise,
     * and 0 if the points are collinear (or not all distinct).
     */
    public int compareThreePoints(Point pointA, Point pointB, Point pointC) {

        int x1 = pointA.getCoordinateX();
        int y1 = pointA.getCoordinateY();

        int x2 = pointB.getCoordinateX();
        int y2 = pointB.getCoordinateY();

        int x3 = pointC.getCoordinateX();
        int y3 = pointC.getCoordinateY();

        int disc = (x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3);

        return compare(disc);
    }

    /**
     * @param pointA on the plan contains coordinate x and y.
     * @param pointB on the plan contains coordinate x and y.
     * @param pointC on the plan contains coordinate x and y.
     * @param pointD on the plan contains coordinate x and y.
     * @return true if the result of the multiplication is 1, that is mean that the 4 points forming convex figure.
     */
    public boolean isConvex(Point pointA, Point pointB, Point pointC, Point pointD) {

       /* Return 1 if the convex hull of pointA, pointB, pointC and pointD is a quadrilateral,
                -1 if a triangle, and 0 if any three of pointA, pointB, pointC and pointD are
        collinear (or if not all points are distinct). */

        int pointCalc = compareThreePoints(pointA, pointB, pointC) * compareThreePoints(pointA, pointB, pointD) *
                compareThreePoints(pointA, pointC, pointD) * compareThreePoints(pointB, pointC, pointD);

        return pointCalc == 1;
    }

    /**
     * Helper method to be used inside the three point comparing
     *
     * @param i number to be compared
     * @return -1 if i < 0, 1 if i > 0, 0 if i == 0
     */
    private int compare(int i) {

        if (i < 0) {
            return -1;
        } else if (i > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
