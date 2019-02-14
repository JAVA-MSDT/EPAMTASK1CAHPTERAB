/**
 * The main purpose is to avoid duplicating code by storing the frequently used formula
 * for the Quadrilateral shapes.
 */

package com.epam.javast.quadrilateral.logic;

import com.epam.javast.quadrilateral.entity.Point;

public class CalculatorHelper {

    /**
     * To return the distance between 2 different points.
     * @param pointA that representing a coordinate A
     * @param pointB that representing a coordinate B
     * @return the distance between 2 points A and B
     */
    public double distance(Point pointA, Point pointB){

        int x1 = pointA.getCoordinateX();
        int y1 = pointA.getCoordinateY();

        int x2 = pointB.getCoordinateX();
        int y2 = pointB.getCoordinateY();


        return  Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * To return the slope between 2 different points.
     * @param pointA that representing a coordinate A
     * @param pointB that representing a coordinate B
     * @return the slope of  betwwen t2 Points A and B
     */
    public double slope(Point pointA, Point pointB){
        int x1 = pointA.getCoordinateX();
        int y1 = pointA.getCoordinateY();

        int x2 = pointB.getCoordinateX();
        int y2 = pointB.getCoordinateY();

        return (y2 - y1) / (x2 - x1);
    }
}
