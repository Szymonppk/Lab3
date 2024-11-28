package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeDescriberTest {

    private Shape rectangle;
    private Shape triangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(5, 10, new Color(255, 0, 0, 1.0));
        triangle = new Triangle(3, 4, 5, 4, new Color(0, 255, 0, 1.0));
    }

    @Test
    void testDescribeRectangle() {

        assertDoesNotThrow(() -> ShapeDescriber.describe(rectangle));
    }

    @Test
    void testDescribeTriangle() {

        assertDoesNotThrow(() -> ShapeDescriber.describe(triangle));
    }
}