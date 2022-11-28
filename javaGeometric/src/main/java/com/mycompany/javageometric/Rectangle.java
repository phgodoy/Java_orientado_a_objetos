package com.mycompany.javageometric;


public class Rectangle {
    private double Width,Height;

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }
    
    public double Area(){
        return this.Height*this.Width;
    }
    
    public double Perimeter(){
        return 2 * (this.Height + this.Width);
    }
    public double Diagonal(){
       return Math.sqrt(Math.pow(this.Width,2) + Math.pow(this.Height,2));
    }
}
