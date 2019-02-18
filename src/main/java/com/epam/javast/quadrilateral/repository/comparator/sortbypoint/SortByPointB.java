package com.epam.javast.quadrilateral.repository.comparator.sortbypoint;

import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SortByPointB implements QuadrilateralComparator {

    @Override
    public int compare(Quadrilateral q1, Quadrilateral q2){
        if (q1 == null || q2 == null) {
            throw new IllegalArgumentException("not allow for the Quadrilateral q1 or Quadrilateral q2 to be null");
        }
        return q1.getPointB().hashCode() - q2.getPointB().hashCode();
    }
}
