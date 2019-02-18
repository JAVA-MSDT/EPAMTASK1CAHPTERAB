package com.epam.javast.quadrilateral.observer;

import com.epam.javast.quadrilateral.entity.QuadrilateralParameter;
import com.epam.javast.quadrilateral.observer.api.Observer;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.logic.calculatorapi.Calculator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class QuadrilateralObserver implements Observer {

    private static Logger logger = LogManager.getLogger(QuadrilateralObserver.class);
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

    /**
     * @param itemId as a key to find in the map
     * @return QuadrilateralParameter object if the key is in the map or null if it is not exist.
     */
    public QuadrilateralParameter getQuadrilateralParameterByItemId(Integer itemId) {
        if (itemId < 0) {
            throw new IllegalArgumentException("Item Id not allow to be negative value");
        }
        if (!quadrilateralParameter.containsKey(itemId)) {
            logger.info("The item id is not exist as a key so we returns");
        }
            return quadrilateralParameter.get(itemId);
    }

    public static Map<Integer, QuadrilateralParameter> getQuadrilateralParameter() {
        return quadrilateralParameter;
    }

    /**
     * to set the calculator to the desired calculator implementation if it square or rectangle,,,, etc.
     *
     * @param calculator reference to the desired calculator implementation
     */
    public void setCalculator(Calculator calculator) {
        if(calculator == null){
            throw new IllegalArgumentException("Not allow for the calculator to be null");
        }
        this.calculator = calculator;
    }

    /**
     *
     * @param item to store in the map also to use it in the observable class
     */
    @Override
    public void update(Quadrilateral item) {
        if(item == null){
            throw new IllegalArgumentException("Not allow for the Quadrilateral item to be null");
        }
        double area = calculator.areaCalculator(item);
        double perimeter = calculator.perimeterCalculator(item);
        quadrilateralParameter.put(item.getQuadrilateralId(), new QuadrilateralParameter(perimeter, area));

    }
}
