package com.epam.javast.quadrilateral.data.write;

import com.epam.javast.quadrilateral.data.write.api.DataWriter;
import com.epam.javast.quadrilateral.data.write.except.DataSaveException;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import com.epam.javast.quadrilateral.util.regexpackage.FrequentlyUsedRegex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile implements DataWriter {

    private String filePath;

    public WriteToFile(String filePath){
        this.filePath = filePath;
    }


    @Override
    public void save(List<Quadrilateral> quadrilateralList) throws DataSaveException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(quadrilateralToString(quadrilateralList));
        } catch (IOException e) {
            throw new DataSaveException("Something went wrong while writing data to the file", e);
        }
    }


    private String quadrilateralToString(List<Quadrilateral> quadrilateralList) {
        StringBuilder builder = new StringBuilder();

        for (Quadrilateral q : quadrilateralList) {
            String x1 = String.valueOf(q.getPointA().getCoordinateX());
            String y1 = String.valueOf(q.getPointA().getCoordinateY());

            String x2 = String.valueOf(q.getPointB().getCoordinateX());
            String y2 = String.valueOf(q.getPointB().getCoordinateY());

            String x3 = String.valueOf(q.getPointC().getCoordinateX());
            String y3 = String.valueOf(q.getPointC().getCoordinateY());

            String x4 = String.valueOf(q.getPointD().getCoordinateX());
            String y4 = String.valueOf(q.getPointD().getCoordinateY());

            builder.append(x1).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y1).append(FrequentlyUsedRegex.SPACE_SPEARATOR);

            builder.append(x2).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y2).append(FrequentlyUsedRegex.SPACE_SPEARATOR);

            builder.append(x3).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y3).append(FrequentlyUsedRegex.SPACE_SPEARATOR);

            builder.append(x4).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y4).append(FrequentlyUsedRegex.SPACE_SPEARATOR);

            builder.append("\n");
        }

        return builder.toString();
    }
}
