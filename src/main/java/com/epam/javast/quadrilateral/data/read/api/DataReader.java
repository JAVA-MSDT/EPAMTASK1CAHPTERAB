package com.epam.javast.quadrilateral.data.read.api;

import com.epam.javast.quadrilateral.data.read.except.DataReaderException;

import java.util.List;

public interface DataReader {
    List<String> read(String url) throws DataReaderException;

}
