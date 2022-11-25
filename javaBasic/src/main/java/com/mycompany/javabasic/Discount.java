package com.mycompany.javabasic;

public class Discount {
    
    public static void generateDiscount(double value){
        double discount;
         
        if(value < 200.00){
            discount = value * 0.1;
        }else{
            discount = 0;
        }

        System.out.println("Discount:" + discount);
    }
    
    public static void generateDiscountTernare(double value){
        double discount = (value < 200.00) ? value * 0.1 : value * 0.0;
        System.out.println("Discount:" + discount);
    }
    
    public double periodicDicount(double value){
        
   
        return value;
    }
}
