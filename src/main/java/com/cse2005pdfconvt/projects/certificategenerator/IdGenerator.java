
package com.cse2005pdfconvt.projects.certificategenerator;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IdGenerator {
    public static Formatter output;
    public static Scanner input;
    public static int id;
    public static String chars;
    private static Department dept;
    private static String finalId;
    
    private static void readPreviousID() {
        
        try {
            input= new Scanner(Paths.get("files/lastid.txt"));
            if(input.hasNext()) id= input.nextInt();
            input.close();
        } catch(IOException exception) {
            System.err.println("Error Opening lastid.txt");
        }
    }
    
    public static void generate(Department department) {
        readPreviousID();
        dept=department;
        switch(dept) {
            case CISCE:
                chars="CISCE";
                break;
          
        }
        id++;
        finalId= chars+id;
        writeID();
        
    }
    
    private static void writeID() {
        try {
            output= new Formatter("files/lastid.txt");
            output.format("%d", id);
            output.close();
            
        } catch(IOException exception) {
            System.err.println("error opening lastid.txt file");
        } catch(NoSuchElementException exception) {
            System.err.println("No such element");
        }
    }
    
    public static String getNewId() {
        return finalId;
    }
    
}
