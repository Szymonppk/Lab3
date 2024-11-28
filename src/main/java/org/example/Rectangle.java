package org.example;

public class Rectangle extends Shape {
    double a;
    double b;


    public Rectangle(double a,double b, Color color)
    {
        super(color);
        this.a =a;
        this.b=b;
    }


    public double getArea()
    {
        return a *b;
    }
    public double getPerimeter()
    {
        return 2*a+2*b;
    }


}

