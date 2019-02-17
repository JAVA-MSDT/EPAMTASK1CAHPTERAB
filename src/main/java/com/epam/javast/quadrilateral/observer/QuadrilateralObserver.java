package com.epam.javast.quadrilateral.observer;

import com.epam.javast.quadrilateral.entity.QuadrilateralParameter;
import com.epam.javast.quadrilateral.observer.api.Observer;
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

    public QuadrilateralParameter getQuadrilateralParameterByItemId(Integer itemId) {
        return quadrilateralParameter.get(itemId);
    }

    public static Map<Integer, QuadrilateralParameter> getQuadrilateralParameter() {
        return quadrilateralParameter;
    }

    /**
     * to set the calculator to the desired calculator implementation if it square or rectangle,,,, etc.
     * @param calculator reference to the desired calculator implementation
     */
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void update(Quadrilateral item) {

        double area = calculator.areaCalculator(item);
        double perimeter = calculator.perimeterCalculator(item);
        quadrilateralParameter.put(item.getQuadrilateralId(), new QuadrilateralParameter(perimeter, area));

    }
}
