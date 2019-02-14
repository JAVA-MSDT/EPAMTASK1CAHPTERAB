package com.epam.javast.quadrilateral.chapterb.observer;

import com.epam.javast.quadrilateral.chapterb.observer.api.Observable;
import com.epam.javast.quadrilateral.chapterb.observer.api.Observer;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

import java.util.ArrayList;
import java.util.List;

public class ObservableQuadrilateral extends Quadrilateral implements Observable<Quadrilateral> {

    private List<Observer<Quadrilateral>> observerList = new ArrayList<>();
    private final Integer id;
    public ObservableQuadrilateral(Integer id, Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA, pointB, pointC, pointD);
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
    public void setPointA(Point pointA) {
        super.setPointA(pointA);
    }

    public void setPointB(Point pointB) {
        super.setPointB(pointB);
    }

    public void setPointC(Point pointC) {
        super.setPointC(pointC);
    }

    public void setPointD(Point pointD) {
        super.setPointD(pointD);
    }

    @Override
    public void addObserver(Observer<Quadrilateral> o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer<Quadrilateral> o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver(Observer<Quadrilateral> o) {
        observerList.forEach(observerList -> observerList.update(this));
    }


}
