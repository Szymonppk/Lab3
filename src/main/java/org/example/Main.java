package org.example;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Color color1 = new Color(255, 255, 255,0.2);
        Color color2 = new Color(50,100,155);
        Color color3 = new Color(60, 30, 10,0.5);
        Color color4 = new Color(5,10,15);

        Shape shape1 = new Rectangle(10,2,color1);
        ShapeDescriber.describe(shape1);


        Shape shape2 = new Triangle(10,10,10,5,color2);
        ShapeDescriber.describe(shape2);

        Shape shape3 = new Rectangle(20,30,color3);
        ShapeDescriber.describe(shape3);

        Shape shape4 = new Triangle(3,10,8,4,color4);
        ShapeDescriber.describe(shape4);

        ShapeRender.renderShapes(Arrays.asList(shape1,shape2,shape3,shape4));


    }



}


