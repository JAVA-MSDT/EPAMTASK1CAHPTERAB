package com.epam.javast.quadrilateral.repository.specification.specifiedimpl;

import com.epam.javast.quadrilateral.repository.specification.api.Specification;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SpecifiedByID implements Specification {
    private Integer id;

    public SpecifiedByID(Integer id){
        this.id = id;
    }

    @Override
    public boolean specified(Quadrilateral quadrilateral) {
        return id.equals(quadrilateral.getQuadrilateralId());
    }
}
