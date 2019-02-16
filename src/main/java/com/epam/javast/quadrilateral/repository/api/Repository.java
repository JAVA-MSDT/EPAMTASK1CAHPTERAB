package com.epam.javast.quadrilateral.repository.api;

import com.epam.javast.quadrilateral.repository.specification.api.Specification;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

import java.util.List;

public interface Repository {

    void add(Quadrilateral quadrilateral);
    void add(Iterable<Quadrilateral> quadrilaterals);
    void remove(Quadrilateral quadrilateral);
    void remove(Specification specification);
    void update(Quadrilateral oldQuadrilateral, Quadrilateral newQuadrilateral);
    List<Quadrilateral> query(Specification specification);


}
