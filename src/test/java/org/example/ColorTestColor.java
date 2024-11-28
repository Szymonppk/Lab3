package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTestColor {

    private Color color;

    @BeforeEach
    void setUp() {
        color = new Color(255, 0, 0, 255); // Czerwony kolor z pełną przezroczystością
    }

    @Test
    void toAnsi() {
        assertEquals("\u001B[31m", color.toAnsi()); // Zakładając, że metoda toAnsi zwraca ANSI kod dla czerwonego
    }

    @Test
    void r() {
        assertEquals(255, color.r());
    }

    @Test
    void g() {
        assertEquals(0, color.g());
    }

    @Test
    void b() {
        assertEquals(0, color.b());
    }

    @Test
    void alpha() {
        assertEquals(255, color.alpha());
    }
}
