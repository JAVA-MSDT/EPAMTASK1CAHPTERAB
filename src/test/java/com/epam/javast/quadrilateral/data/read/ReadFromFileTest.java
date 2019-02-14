package com.epam.javast.quadrilateral.data.read;

import com.epam.javast.quadrilateral.data.read.except.DataReaderException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ReadFromFileTest {

    private static final ReadFromFile fromFile = new ReadFromFile();
    String filePath = "file/point.txt";
    private static final List<String> stringList = Arrays.asList("1,5 2,3 4,5 6,4",
            "1,a b,5 5,5 -4,3",
            "0,8 h,4 1,6 5,5",
            "10,5 2,-3 4,7 4,4",
            "1,8 6,5 5,-5 -4,3",
            "0,8 h,4 1,6 5,5");

    @Test
    public void readTestPass(){
        try {
            List<String> dataFromFile = fromFile.read(filePath);
            Assert.assertEquals(stringList, dataFromFile);
        } catch (DataReaderException e) {
            e.printStackTrace();
        }

    }

}
