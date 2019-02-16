package com.epam.javast.quadrilateral.chapterb.observer;

import com.epam.javast.quadrilateral.chapterb.figure.QuadrilateralParameter;
import com.epam.javast.quadrilateral.chapterb.observer.api.Observer;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;

import java.util.HashMap;
import java.util.Map;

public class QuadrilateralObserver implements Observer {

    private Calculator calculator;
    private static QuadrilateralObserver instance;

    private static Map<Integer, QuadrilateralParameter> quadrilateralParameter;

    private QuadrilateralObserver() {
        quadrilateralParameter = new HashMap<>();
    }

    public static QuadrilateralObserver getInstance() {
        if (instance == null) {
            instance = new QuadrilateralObserver();
        }
        return instance;
    }

    @Override
    public void update(Quadrilateral item) {

        double area = calculator.areaCalculator(item);
        double perimeter = calculator.perimeterCalculator(item);
        quadrilateralParameter.put(item.getQuadrilateralId(), new QuadrilateralParameter(perimeter, area));

    }

    public void add(Quadrilateral item) {
        double area = calculator.areaCalculator(item);
        double perimeter = calculator.perimeterCalculator(item);
        quadrilateralParameter.put(item.getQuadrilateralId(), new QuadrilateralParameter(perimeter, area));
    }
}
