package com.epam.javast.quadrilateral.repository.comparator.sortbycoordinate;

import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SortByPointACoordinateX implements QuadrilateralComparator {

    @Override
    public int compare(Quadrilateral q1, Quadrilateral q2) {
        return q1.getPointA().getCoordinateX() - q2.getPointA().getCoordinateX();
    }
}
