package com.epam.javast.quadrilateral.chapterb.observer.api;

import com.epam.javast.quadrilateral.entity.Quadrilateral;

public interface Observer<T extends Quadrilateral> {

    void update(T item);
}
