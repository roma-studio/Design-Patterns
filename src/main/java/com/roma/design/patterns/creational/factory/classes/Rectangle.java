package com.roma.design.patterns.creational.factory.classes;

import com.roma.design.patterns.creational.factory.interfaces.Shape;

/**
 * Created by Roma on 5/1/16.
 */
public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
