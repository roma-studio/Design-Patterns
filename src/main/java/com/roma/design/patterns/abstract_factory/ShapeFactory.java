package com.roma.design.patterns.abstract_factory;

/**
 * Created by Roma on 5/1/16.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {

        if (shape == null || "".equals(shape.trim())) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}