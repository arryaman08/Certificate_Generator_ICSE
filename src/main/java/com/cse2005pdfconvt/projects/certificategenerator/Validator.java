
package com.cse2005pdfconvt.projects.certificategenerator;

import java.util.ArrayList;


public class Validator {
    public static boolean validateCertificate(String id) {
        FileHandler handler= new FileHandler();
        ArrayList<String> idList= handler.getAllId();
        
        boolean valid= false;
        
        for(String s: idList) {
            if(id.equals(s)) {
                valid= true;
                break;
            }
        }
        
        return valid;
    }
}
