package com.epam.javast.quadrilateral.except;

/**
 * The purpose of this class is to use it in case we search some data inside a list or map,, etc and the
 * item not in the storage.
 */
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
