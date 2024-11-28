package org.example;

public class Triangle extends Shape
{
    double a;
    double b;
    double c;
    double h;


    public Triangle(double a, double b,double c,double h, Color color)
    {
        super(color);
        this.a =a;
        this.b =b;
        this.c =c;
        this.h =h;


    }
    public double getArea()
    {
        return a*h/2;
    }
    public double getPerimeter()
    {
        return a+b+c;
    }


}

