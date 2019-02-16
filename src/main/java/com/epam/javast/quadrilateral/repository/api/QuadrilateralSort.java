package com.epam.javast.quadrilateral.repository.api;

import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public interface QuadrilateralSort {

    void sort(Quadrilateral quadrilateral, QuadrilateralComparator compare);
}
