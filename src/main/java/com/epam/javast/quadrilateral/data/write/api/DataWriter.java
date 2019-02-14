package com.epam.javast.quadrilateral.data.write.api;

import com.epam.javast.quadrilateral.data.write.except.DataSaveException;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

import java.util.List;

public interface DataWriter {

    void save(List<Quadrilateral> quadrilateralList) throws DataSaveException;
}
