package com.epam.javast.quadrilateral.chapterb.observer;

import com.epam.javast.quadrilateral.chapterb.figure.QuadrilateralParameter;
import com.epam.javast.quadrilateral.chapterb.observer.api.Observer;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;

import java.util.HashMap;
import java.util.Map;

public class QuadrilateralObserver implements Observer<Quadrilateral> {

    private Map<Integer, QuadrilateralParameter> quadrilateralParameter = new HashMap<>();
    private final Calculator calculator;


    public QuadrilateralObserver(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public void update(Quadrilateral item) {

        double area = calculator.areaCalculator(item);
        double perimeter = calculator.perimeterCalculator(item);
quadrilateralParameter.put(1, new QuadrilateralParameter(perimeter, area));


    }

    public QuadrilateralParameter getParameter(Integer id){
        return quadrilateralParameter.get(id);
    }
}
