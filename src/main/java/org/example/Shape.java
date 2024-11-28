package org.example;

public abstract class Shape {

    public Color color;
    public Shape(Color color)
    {
        this.color = color;
    }
    public String getColorDescription()
    {
        return "R: " + this.color.r() + " G: " + this.color.g()+ " B: " + this.color.b()+ "Alpha: " + this.color.alpha();

    }
    public abstract double getArea();
    public abstract double getPerimeter();




}

