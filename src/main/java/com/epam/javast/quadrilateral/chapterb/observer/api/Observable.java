package com.epam.javast.quadrilateral.chapterb.observer.api;


import com.epam.javast.quadrilateral.entity.Quadrilateral;

public interface Observable<T extends Quadrilateral> {

    void addObserver(Observer<T> o);
    void removeObserver(Observer<T> o);
    void notifyObserver(Observer<T> o);

}
