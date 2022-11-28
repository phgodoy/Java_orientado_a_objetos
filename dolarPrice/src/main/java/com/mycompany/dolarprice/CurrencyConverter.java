package com.mycompany.dolarprice;


public class CurrencyConverter {
    public static final double IOF = 0.6;
    
    public static double payDollar(double dollarPrice, double dollarQuant){
        return (IOF * dollarPrice) * dollarQuant;
    }
}
