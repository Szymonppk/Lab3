package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ShapeRenderTest {

    @Test
    void renderShapes_ShouldRenderRectangleAndTriangle() {

        Color red = new Color(255, 0, 0, 1.0);
        Shape rectangle = new Rectangle(5, 3, red);
        Shape triangle = new Triangle(4, 4, 4, 4, red);


        ShapeRender shapeRender = new ShapeRender();


        try {
            shapeRender.renderShapes(Arrays.asList(rectangle, triangle));
        } catch (Exception e) {
            fail("renderShapes threw an exception: " + e.getMessage());
        }
    }
}