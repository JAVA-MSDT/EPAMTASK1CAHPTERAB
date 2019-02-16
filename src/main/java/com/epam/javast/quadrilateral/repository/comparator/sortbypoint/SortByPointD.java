package com.epam.javast.quadrilateral.repository.comparator.sortbypoint;

import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SortByPointD implements QuadrilateralComparator {

    @Override
    public int compare(Quadrilateral q1, Quadrilateral q2){

        return q1.getPointD().hashCode() - q2.getPointD().hashCode();
    }
}