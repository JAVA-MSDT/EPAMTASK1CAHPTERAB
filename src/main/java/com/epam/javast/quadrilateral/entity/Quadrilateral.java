package com.epam.javast.quadrilateral.entity;

import java.util.Objects;

public class Quadrilateral {

    private  Point pointA;
    private  Point pointB;
    private  Point pointC;
    private  Point pointD;

    public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }

        if(obj == null){
            return false;
        }

        if(getClass() != obj.getClass()){
            return false;
        }

         Quadrilateral g = (Quadrilateral) obj;

        return  equalHelper(this.pointA, g.pointA) &&
                equalHelper(this.pointB, g.pointB) &&
                equalHelper(this.pointC, g.pointC) &&
                equalHelper(this.pointD, g.pointD);
    }

    private boolean equalHelper(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((pointA == null) ? 0 : pointA.hashCode());
        result = prime * result + ((pointB == null) ? 0 : pointB.hashCode());
        result = prime * result + ((pointC == null) ? 0 : pointC.hashCode());
        result = prime * result + ((pointD == null) ? 0 : pointD.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "{ " + getClass().getSimpleName() + " coordinates are: " +
                "pointA= " + pointA +
                ", pointB= " + pointB +
                ", pointC= " + pointC +
                ", pointD= " + pointD +
                '}';
    }
}