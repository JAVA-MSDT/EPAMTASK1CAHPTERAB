package com.epam.javast.quadrilateral.validator;

import org.junit.Assert;
import org.junit.Test;

public class NumericValueValidatorTest {

    private static final NumericValueValidator numericValue = new NumericValueValidator();

    @Test
    public void isNumericTestPass(){
        String number = "4400";

        boolean actual = numericValue.isNumeric(number);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumericTestFail(){
        String number = "4400Done";

        boolean actual = numericValue.isNumeric(number);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }
}
