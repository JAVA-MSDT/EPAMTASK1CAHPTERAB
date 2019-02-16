package com.epam.javast.quadrilateral.chapterb.observer;

import com.epam.javast.quadrilateral.chapterb.observer.api.Observable;
import com.epam.javast.quadrilateral.chapterb.observer.api.Observer;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

import java.util.ArrayList;
import java.util.List;

public class ObservableQuadrilateral extends Quadrilateral implements Observable{

    private List<Observer> observerList = new ArrayList<>();

    public ObservableQuadrilateral(){

    }
    public ObservableQuadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA, pointB, pointC, pointD);

    }



    public void setPointA(Point pointA) {
        super.setPointA(pointA);
        notifyObserver();
    }

    public void setPointB(Point pointB) {
        super.setPointB(pointB);
        notifyObserver();
    }

    public void setPointC(Point pointC) {
        super.setPointC(pointC);
        notifyObserver();
    }

    public void setPointD(Point pointD) {
        super.setPointD(pointD);
        notifyObserver();
    }

    @Override
    public void setQuadrilateralId(Integer quadrilateralId) {
        super.setQuadrilateralId(quadrilateralId);
        notifyObserver();
    }

    @Override
    public void setGeneratedQuadrilateralId() {
        super.setGeneratedQuadrilateralId();
        notifyObserver();
    }

    @Override
    public Integer getQuadrilateralId() {
        return super.getQuadrilateralId();
    }
    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(observerList -> observerList.update(this));
    }



}
