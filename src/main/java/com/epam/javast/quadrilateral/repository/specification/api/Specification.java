package com.epam.javast.quadrilateral.repository.specification.api;

import com.epam.javast.quadrilateral.entity.Quadrilateral;

public interface Specification {

    boolean specified(Quadrilateral quadrilateral);
}
