package org.example;

public record Color(int r,int g,int b, double alpha)
{
    public Color
    {
        if ((r > 255) || (g > 255) || (b > 255) || (alpha < 0) || (alpha > 1)) {
            throw new IllegalArgumentException("Colors must be between 0 and 255 and alpha between 0 and 1");
        }
    }
    public String toAnsi() {
        return String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
    }

    public Color(int r,int g,int b)
    {
        this(r,g,b,0);
    }


}

