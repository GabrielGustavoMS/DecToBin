/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Gabriel Gustavo
 */
public class Converter {
    
     public static String decimalToBinary(String decimalNumber){
          String result = "";
        try {
            int dec = Integer.parseInt(decimalNumber);
            String number = Integer.toBinaryString(dec);
            result = number;
           
        } catch (Exception e) {
            result = "The decimal number field accepts only numbers";
            System.out.println(""+e);
        }
        
        return result;
    }

}
