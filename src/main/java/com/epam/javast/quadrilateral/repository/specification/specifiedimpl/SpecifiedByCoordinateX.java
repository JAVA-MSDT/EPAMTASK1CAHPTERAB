package com.epam.javast.quadrilateral.repository.specification.specifiedimpl;

import com.epam.javast.quadrilateral.repository.specification.api.Specification;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SpecifiedByCoordinateX implements Specification {

    private int coordinateX;

    public SpecifiedByCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    @Override
    public boolean specified(Quadrilateral quadrilateral) {

        return  coordinateX == quadrilateral.getPointA().getCoordinateX() ||
                coordinateX == quadrilateral.getPointB().getCoordinateX() ||
                coordinateX == quadrilateral.getPointC().getCoordinateX() ||
                coordinateX == quadrilateral.getPointD().getCoordinateX();
    }
}
