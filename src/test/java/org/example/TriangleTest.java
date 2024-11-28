package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle;
    private Color color;

    @BeforeEach
    void setUp() {

        color = new Color(3, 4, 5, 1.0);
        triangle = new Triangle(3, 4, 5, 4, color);
    }

    @Test
    void getArea() {

        double expectedArea = 6.0;
        assertEquals(expectedArea, triangle.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {

        double expectedPerimeter = 12.0;
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.001);
    }

    @Test
    void getColor() {

        assertNotNull(triangle.color, "Kolor trójkąta nie powinien być null");
        assertEquals(color, triangle.color, "Kolor trójkąta nie zgadza się");
    }
}