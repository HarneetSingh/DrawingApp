package com.cs.shape;

import com.cs.Canvas;

public class Rectangle implements Shape {


    private Canvas canvas;


    public Rectangle(Canvas canvas)
    {
        this.canvas=canvas;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2, char d) {
        char[][] canvasArray = this.canvas.getCanvasArray();


        for(int i=x1;i<=x2;i++)
        {
            canvasArray[y1][i] = d;
            canvasArray[y2][i] = d;

        }
        for(int j=y1;j<=y2;j++)
        {
            canvasArray[j][x1] = d;
            canvasArray[j][x2] = d;

        }
    }
}
