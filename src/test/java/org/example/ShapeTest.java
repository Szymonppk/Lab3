package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private Shape shape;

    @BeforeEach
    void setUp() {
        shape = new Rectangle(4, 5, new Color(255, 0, 0, 1.0)); // przykładowy kształt
    }

    @Test
    void getArea() {
        double expectedArea = 20.0; // Pole prostokąta 4 * 5
        assertEquals(expectedArea, shape.getArea());
    }

    @Test
    void getPerimeter() {
        double expectedPerimeter = 18.0; // Obwód prostokąta 2 * (4 + 5)
        assertEquals(expectedPerimeter, shape.getPerimeter());
    }

    @Test
    void getColorDescription() {
        String expectedColor = "R: 255 G: 0 B: 0Alpha: 1.0"; // opis koloru
        assertEquals(expectedColor, shape.getColorDescription());
    }
}