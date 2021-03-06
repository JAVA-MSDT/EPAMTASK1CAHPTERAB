package com.epam.javast.quadrilateral.validator;

import com.epam.javast.quadrilateral.util.regexpackage.FrequentlyUsedRegex;

public class NumericValueValidator {


    /**
     * to check if the string is numeric value or not
     * @param str to check it is numeric value or not.
     * @return true if it is numeric value or false if it is not numeric value
     */
    public boolean isNumeric(String str) {
        if(str == null){
            throw new IllegalArgumentException("Str is not allow to be null");
        }
        return str.matches(FrequentlyUsedRegex.NUMERIC_VALUE);
    }
}
