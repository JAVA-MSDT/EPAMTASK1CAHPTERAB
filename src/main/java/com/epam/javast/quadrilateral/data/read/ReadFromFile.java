package com.epam.javast.quadrilateral.data.read;

import com.epam.javast.quadrilateral.data.read.api.DataReader;
import com.epam.javast.quadrilateral.data.read.except.DataReaderException;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFromFile implements DataReader {

    private Logger logger = LogManager.getLogger(ReadFromFile.class);

    public List<String> read(String url) throws DataReaderException {
        if(url == null || url.isEmpty()){
            throw new IllegalArgumentException("URI is not allow to be null or empty");
        }
        List<String> point = new ArrayList<>();

        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(url))){

            String line = bufferedReader.readLine();
            while (line != null) {
                point.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
           throw new DataReaderException("File not found in the specified location", e);
        } catch (IOException e) {
            throw new DataReaderException(e);

        }


        return point;
    }

}
