package com.epam.javast.quadrilateral.repository.except;

public class RepositoryException extends Exception {


    private static final long serialVersionUID = 7617047012302865353L;

    public RepositoryException(){
        super();
    }

    public RepositoryException(String message){
        super(message);
    }

    public RepositoryException(String message, Throwable cause) {

        super(message, cause);
    }

    public RepositoryException(Throwable cause) {
        super(cause);
    }
}
