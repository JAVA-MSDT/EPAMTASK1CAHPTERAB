package com.epam.javast.quadrilateral.data.write.except;

public class DataSaveException extends Exception {


    private static final long serialVersionUID = 5694490412393912090L;

    public DataSaveException(){
        super();
    }

    public DataSaveException(String message){
        super(message);
    }

    public DataSaveException(String message, Throwable cause) {

        super(message, cause);
    }

    public DataSaveException(Throwable cause) {
        super(cause);
    }
}
