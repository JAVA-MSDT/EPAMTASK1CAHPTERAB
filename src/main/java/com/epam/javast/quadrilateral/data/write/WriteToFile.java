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

    /**
     *
     * @param quadrilateralList to store it in a file
     * @throws DataSaveException if something went wrong in sending data to file
     */
    @Override
    public void save(List<Quadrilateral> quadrilateralList) throws DataSaveException {
        if(quadrilateralList == null){
            throw new IllegalArgumentException("quadrilateralList not allow to be null");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(quadrilateralToString(quadrilateralList));
        } catch (IOException e) {
            throw new DataSaveException("Something went wrong while writing data to the file", e);
        }
    }

    /**
     * Helper method to convert quadrilateralList to a styling string in order to save it in a file
     * @param quadrilateralList to be converted to a string
     * @return string contains styling of how the list of Quadrilateral will looks like in a file
     */
    private String quadrilateralToString(List<Quadrilateral> quadrilateralList) {
        if(quadrilateralList == null){
            throw new IllegalArgumentException("quadrilateralList not allow to be null");
        }
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
            builder.append(y1).append(FrequentlyUsedRegex.SPACE_SEPARATOR);

            builder.append(x2).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y2).append(FrequentlyUsedRegex.SPACE_SEPARATOR);

            builder.append(x3).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y3).append(FrequentlyUsedRegex.SPACE_SEPARATOR);

            builder.append(x4).append(FrequentlyUsedRegex.COMMA_SEPARATOR);
            builder.append(y4).append(FrequentlyUsedRegex.SPACE_SEPARATOR);

            builder.append("\n");
        }

        return builder.toString();
    }
}
