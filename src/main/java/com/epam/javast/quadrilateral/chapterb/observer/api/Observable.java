package com.epam.javast.quadrilateral.chapterb.observer.api;


public interface Observable {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
