package com.epam.javast.quadrilateral.parser.api;

import com.epam.javast.quadrilateral.entity.Point;

import java.util.List;

public interface PointParser {

    List<Point> pointParser(List<String> listOfPoints);
}
