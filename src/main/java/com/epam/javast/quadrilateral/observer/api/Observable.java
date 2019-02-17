package com.epam.javast.quadrilateral.observer.api;


public interface Observable {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
