package com.epam.javast.quadrilateral.util.generator;

public class IdGenerator {
    private static int id;

    public static int idGenerator(){
        return id++;
    }

    private IdGenerator(){
        
    }
}
