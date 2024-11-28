package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Color color;
    @BeforeEach
    void setUp() {
        color = new Color(15, 15, 15, 1.0);
        rectangle = new Rectangle(4,5, color); // Przykładowe wymiary prostokąta
    }

    @Test
    void getArea() {
        double expectedArea = 20.0;
        assertEquals(expectedArea, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        double expectedPerimeter = 18.0;
        assertEquals(expectedPerimeter, rectangle.getPerimeter());
    }

    @Test
    void getColor() {

        assertNotNull(rectangle.color, "Kolor trójkąta nie powinien być null");
        assertEquals(color, rectangle.color, "Kolor trójkąta nie zgadza się");
    }

}