package com.epam.javast.quadrilateral.validator;

import org.junit.Assert;
import org.junit.Test;

public class NumericValueValidatorTest {

    private static final NumericValueValidator numericValue = new NumericValueValidator();

    @Test
    public void isNumericTestReturnTrue(){
        String number = "4400";

        boolean actual = numericValue.isNumeric(number);

        Assert.assertTrue(actual);
    }

    @Test
    public void isNumericTestReturnFalse(){
        String number = "4400Done";

        boolean actual = numericValue.isNumeric(number);

        Assert.assertFalse(actual);
    }
}
