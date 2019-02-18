package com.epam.javast.quadrilateral.observer;

import com.epam.javast.quadrilateral.observer.api.Observable;
import com.epam.javast.quadrilateral.observer.api.Observer;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class QuadrilateralObservable extends Quadrilateral implements Observable {

    private static Logger logger = LogManager.getLogger(QuadrilateralObservable.class);
    private List<Observer> observerList = new ArrayList<>();

    public QuadrilateralObservable() {

    }

    public QuadrilateralObservable(Point pointA, Point pointB, Point pointC, Point pointD) {
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

    public List<Observer> getObserverList() {
        return observerList;
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
        if (o == null) {
            throw new IllegalArgumentException(" observer not allow to be null");
        }
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (o == null) {
            throw new IllegalArgumentException(" observer not allow to be null");
        }
        if(!observerList.isEmpty()){
            observerList.remove(o);
        }

        logger.info("Observer List is empty");

    }

    @Override
    public void notifyObserver() {

        for (Observer o : observerList) {
            o.update(this);
        }
    }


}
