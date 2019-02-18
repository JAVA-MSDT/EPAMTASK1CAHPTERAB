package com.epam.javast.quadrilateral.repository.specification.specifiedimpl;

import com.epam.javast.quadrilateral.repository.specification.api.Specification;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

public class SpecifiedByID implements Specification {
    private Integer id;

    public SpecifiedByID(Integer id){
        setId(id);
    }

    private void setId(Integer id){
        if(id == null){
            throw new IllegalArgumentException("Id not allow to be null");
        }

        this.id = id;
    }
    @Override
    public boolean specified(Quadrilateral quadrilateral) {
        if (quadrilateral == null) {
            throw new IllegalArgumentException("not allow for the quadrilateral to be null");
        }
        return id.equals(quadrilateral.getQuadrilateralId());
    }
}
