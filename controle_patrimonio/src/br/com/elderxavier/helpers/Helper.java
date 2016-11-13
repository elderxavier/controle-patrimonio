/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elderxavier.helpers;

/**
 *
 * @author elder
 */
public class Helper {

    public static boolean IsNumeric(String n) {        
        try {
            double parse = Double.parseDouble(n);  
        } catch (NumberFormatException ex) {
             return false;
        }
        return true;
    }
    public static String getDecimalString(double d ){        
        String ret = String.valueOf(d);
        String[] parts = ret.split("[.]");        
        parts[1] = parts[1].length() < 2 ? parts[1] + "0" : parts[1];        
        ret = parts[0] + "," + parts[1];        
        return ret;
    }

}
