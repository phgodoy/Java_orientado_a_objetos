package com.mycompany.javageometric;
import java.util.Locale;
import java.util.Scanner;

public class JavaGeometric {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Triangle x, y;
    x = new Triangle();
    y = new Triangle();
    System.out.println("Enter the measures of triangle X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    System.out.println("Enter the measures of triangle Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();
    double p = (x.a + x.b + x.c) / 2.0;
    //double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
    double areaX = x.area();
    double areaY = y.area();
    p = (y.a + y.b + y.c) / 2.0;
    System.out.println(areaX);
    System.out.println(areaY);
    //double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
    }
}
