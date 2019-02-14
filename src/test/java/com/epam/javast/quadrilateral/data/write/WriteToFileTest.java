package com.epam.javast.quadrilateral.data.write;

import com.epam.javast.quadrilateral.data.write.except.DataSaveException;
import com.epam.javast.quadrilateral.entity.Point;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;



public class WriteToFileTest {

    private static final String FILE_PATH = "file/formatted.txt";
    private WriteToFile toFile = new WriteToFile(FILE_PATH);


    private Point pointA = new Point(1, 5);
    private Point pointB = new Point(2, 3);
    private Point pointC = new Point(4, 5);
    private Point pointD = new Point(6, 4);

    private Point pointE = new Point(10, 20);
    private Point pointF = new Point(20, 20);
    private Point pointG = new Point(10, 10);
    private Point pointH = new Point(20, 10);

    private Quadrilateral quadrilateralA = new Quadrilateral(pointA, pointB, pointC, pointD);
    private Quadrilateral quadrilateralB = new Quadrilateral(pointE, pointF, pointG, pointH);

    private List<Quadrilateral> quadrilateralList = Arrays.asList(quadrilateralA, quadrilateralB);


    private String read(String filePath)  {
        StringBuilder builder = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = bufferedReader.readLine();
            while (line != null) {
                builder.append(line).append("\n");
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getMessage();
        }


        return builder.toString();
    }

    @Test
    public void testWrite() throws DataSaveException, IOException {

        toFile.save(quadrilateralList);

        String actual = read(FILE_PATH);
        String expected = "1,5 2,3 4,5 6,4 " + "\n" + "10,20 20,20 10,10 20,10 " + "\n";

        Assert.assertEquals(expected, actual);
    }
}




