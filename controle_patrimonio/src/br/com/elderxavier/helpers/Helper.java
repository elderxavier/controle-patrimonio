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

}
