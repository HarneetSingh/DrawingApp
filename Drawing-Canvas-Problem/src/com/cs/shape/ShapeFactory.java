package com.cs.shape;

import com.cs.Canvas;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType, Canvas c)
    {
        switch (shapeType)
        {
            case LINE:
                return new Line(c);
            case RECTANGLE:
                return new Rectangle(c);

            default:
                return null;
        }
    }
}
