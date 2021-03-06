package com.epam.javast.quadrilateral.entity;

import com.epam.javast.quadrilateral.util.generator.IdGenerator;

public class Quadrilateral {

    private  Point pointA;
    private  Point pointB;
    private  Point pointC;
    private  Point pointD;
    private Integer quadrilateralId;

    public  Quadrilateral(){

    }
    public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD){
        setPointA(pointA);
        setPointB(pointB);
        setPointC(pointC);
        setPointD(pointD);
    }

    public void setPointA(Point pointA) {
        if(pointA == null){
            throw new IllegalArgumentException("pointA not allow to be null");
        }
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        if(pointB == null){
            throw new IllegalArgumentException("pointB not allow to be null");
        }
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        if(pointC == null){
            throw new IllegalArgumentException("pointC not allow to be null");
        }
        this.pointC = pointC;
    }

    public void setPointD(Point pointD) {
        if(pointD == null){
            throw new IllegalArgumentException("pointD not allow to be null");
        }
        this.pointD = pointD;
    }

    public void setQuadrilateralId(Integer quadrilateralId){
        if(quadrilateralId < 0){
            this.quadrilateralId = IdGenerator.idGenerator();
        }
            this.quadrilateralId = quadrilateralId;

    }

    public void setGeneratedQuadrilateralId(){
        this.quadrilateralId = IdGenerator.idGenerator();
    }

    public Integer getQuadrilateralId() {
        return quadrilateralId;
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

        return  equalHelper(this.quadrilateralId, g.quadrilateralId) &&
                equalHelper(this.pointA, g.pointA) &&
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

        result = prime * result + ((quadrilateralId == null) ? 0 : quadrilateralId.hashCode());
        result = prime * result + ((pointA == null) ? 0 : pointA.hashCode());
        result = prime * result + ((pointB == null) ? 0 : pointB.hashCode());
        result = prime * result + ((pointC == null) ? 0 : pointC.hashCode());
        result = prime * result + ((pointD == null) ? 0 : pointD.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "{ " + getClass().getSimpleName() + " coordinates are: " +
                "Id= " + quadrilateralId +
                ", pointA= " + pointA +
                ", pointB= " + pointB +
                ", pointC= " + pointC +
                ", pointD= " + pointD +
                '}';
    }
}
