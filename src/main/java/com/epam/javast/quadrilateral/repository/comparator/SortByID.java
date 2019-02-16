package com.epam.javast.quadrilateral.repository.comparator;

import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SortByID implements QuadrilateralComparator {

    @Override
    public int compare(Quadrilateral q1, Quadrilateral q2) {
        return q1.getQuadrilateralId().hashCode() - q2.getQuadrilateralId().hashCode();
    }
}
