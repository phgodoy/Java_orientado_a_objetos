
package com.mycompany.javageometric;


public class Triangle {
        public double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
       
        
    public double area() {
           double p = (a + b + c) / 2.0;
           return Math.sqrt(p * (p - a) * (p - b) * (p - c));
     };

    public double delta() {
        double delta = Math.pow(b, 2.0) -4*a*c;
        return delta;
    }
    
    public void getXs(double delta){
        
        double x1 = (-b + Math.sqrt(delta) / (2.0 * a));
        double x2 = (-b - Math.sqrt(delta) / (2.0 * a));
        
        System.out.println(x1);
        System.out.println(x2);
    }
       
}
