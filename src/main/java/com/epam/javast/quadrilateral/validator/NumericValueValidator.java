package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.regexpackage.FrequentlyUsedRegex;

public class NumericValueValidator {

    private FrequentlyUsedRegex frequentlyUsedRegex = new FrequentlyUsedRegex();

    /**
     * to check if the string is numeric value or not
     * @param str to check it is numeric value or not.
     * @return true if it is numeric value or false if it is not numeric value
     */
    public boolean isNumeric(String str) {
        return str.matches(frequentlyUsedRegex.NUMERIC_VALUE);
    }
}
