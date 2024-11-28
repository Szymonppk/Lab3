package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber
{
    final static Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);
    public static void describe(Shape shape)
    {
        logger.info("Figura: " + shape.getClass().getSimpleName());
        logger.info("Pole: " + shape.getArea());
        logger.info("Obwód " + shape.getPerimeter());
        logger.info("Kolor: " + shape.getColorDescription());

    }



}

