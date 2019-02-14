package com.epam.javast.quadrilateral.entity;


public class Point {
    private final int coordinateX;
    private final int coordinateY;

    public Point(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(getClass() != obj.getClass()){
            return false;
        }

        Point p = (Point) obj;
        if(coordinateY != p.coordinateY){
            return false;
        }

        return coordinateX == p.coordinateX;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + coordinateX;
        result = result * prime + coordinateY;
        return result;
    }

    @Override
    public String toString() {
        return "{ " + getClass().getSimpleName() +": " +
                "coordinateX is: " + coordinateX +
                ", coordinateY is: " + coordinateY +
                '}';
    }
}
