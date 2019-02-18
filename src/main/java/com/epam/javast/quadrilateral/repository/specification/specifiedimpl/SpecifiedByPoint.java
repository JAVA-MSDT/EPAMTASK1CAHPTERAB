package com.epam.javast.quadrilateral.repository.specification.specifiedimpl;

import com.epam.javast.quadrilateral.repository.specification.api.Specification;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SpecifiedByPoint implements Specification {

    private Point point;

    public SpecifiedByPoint(Point point) {
        setPoint(point);
    }

    private void setPoint(Point point){
        if (point == null) {
            throw new IllegalArgumentException("not allow for a point to be null");
        }
        this.point = point;
    }
    @Override
    public boolean specified(Quadrilateral quadrilateral) {
        if (quadrilateral == null) {
            throw new IllegalArgumentException("not allow for the quadrilateral to be null");
        }
        return  point.equals(quadrilateral.getPointA()) ||
                point.equals(quadrilateral.getPointB()) ||
                point.equals(quadrilateral.getPointC()) ||
                point.equals(quadrilateral.getPointD());
    }
}
