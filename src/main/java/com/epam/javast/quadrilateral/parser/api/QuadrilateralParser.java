package com.epam.javast.quadrilateral.parser.api;

import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

import java.util.List;

public interface QuadrilateralParser {

    List<Quadrilateral> quadrilateralParser(List<Point> pointList);
}
