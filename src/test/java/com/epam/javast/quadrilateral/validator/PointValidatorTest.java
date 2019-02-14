package com.epam.javast.quadrilateral.validator;

import org.junit.Assert;
import org.junit.Test;

public class PointValidatorTest {

    private static final PointValidator pointValidator = new PointValidator();

    @Test
    public void isValidPointTestPass() {
        String[] validPoint = {"1,5", "2,3", "4,5", "6,4"};

        boolean actual = pointValidator.isValidPoint(validPoint);

        Assert.assertTrue("isValidPointTestPass", actual);

    }

    @Test
    public void isValidPointTestFail() {
        String[] validPoint = {"1,5", "2,3", "4,5", "6,F"};

        boolean actual = pointValidator.isValidPoint(validPoint);

        Assert.assertFalse("Test is false", actual);

    }
}
