package com.jansmerecki;

import com.jansmerecki.editor.ImageEditor;
import com.jansmerecki.shapes.Circle;
import com.jansmerecki.shapes.CompoundShape;
import com.jansmerecki.shapes.Dot;
import com.jansmerecki.shapes.Rectangle;

import java.awt.*;


public class Demo {

    public static void main(String[] args) {

        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}