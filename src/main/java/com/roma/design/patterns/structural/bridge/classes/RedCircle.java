package com.roma.design.patterns.structural.bridge.classes;

import com.roma.design.patterns.structural.bridge.interfaces.DrawAPI;

/**
 * Created by Roma on 5/6/16.
 */
public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
