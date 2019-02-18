package com.epam.javast.quadrilateral.except;

public class NotExistException extends RuntimeException {
    public NotExistException(){
        super();
    }
    
    public NotExistException(String message, Throwable cause){
        super(message, cause);
    }
    
    public NotExistException(String message){
        super(message);
    }
    
    public NotExistException(Throwable cause){
        super(cause);
    }
}
