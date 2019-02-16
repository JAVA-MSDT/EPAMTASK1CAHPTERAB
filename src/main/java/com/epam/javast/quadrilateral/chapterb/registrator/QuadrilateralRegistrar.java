package com.epam.javast.quadrilateral.chapterb.registrator;

import com.epam.javast.quadrilateral.chapterb.figure.QuadrilateralParameter;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;

import java.util.HashMap;
import java.util.Map;

public class QuadrilateralRegistrar {

    private Calculator calculator;
    private static QuadrilateralRegistrar instance;

    private static Map<Integer, QuadrilateralParameter> quadrilateralParameter;

    private QuadrilateralRegistrar() {
        quadrilateralParameter = new HashMap<>();
    }

    public static QuadrilateralRegistrar getInstance() {
        if (instance == null) {
            instance = new QuadrilateralRegistrar();
        }
        return instance;
    }

    public void add(Quadrilateral quadrilateral) {
        double area = calculator.areaCalculator(quadrilateral);
        double perimeter = calculator.perimeterCalculator(quadrilateral);
        quadrilateralParameter.put(quadrilateral.getQuadrilateralId(), new QuadrilateralParameter(perimeter, area));
    }

    public void update(Quadrilateral quadrilateral) {
        double area = calculator.areaCalculator(quadrilateral);
        double perimeter = calculator.perimeterCalculator(quadrilateral);
        quadrilateralParameter.replace(quadrilateral.getQuadrilateralId(), new QuadrilateralParameter(perimeter, area));
    }
}
