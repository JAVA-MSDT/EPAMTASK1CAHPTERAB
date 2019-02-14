package com.epam.javast.quadrilateral.data.read.except;

public class DataReaderException extends Exception {

    private static final long serialVersionUID = -1901409754791973804L;

    public DataReaderException(){
        super();
    }

    public DataReaderException(String message){
        super(message);
    }

    public DataReaderException(String message, Throwable cause) {

        super(message, cause);
    }

    public DataReaderException(Throwable cause) {
        super(cause);
    }
}
