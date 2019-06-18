package com.cs.shape;

import com.cs.Canvas;

public class Line implements Shape {


    private Canvas canvas;


    public Line(Canvas canvas)
    {
        this.canvas=canvas;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2, char d) {

        char[][] canvasArray = this.canvas.getCanvasArray();

        if(x1==x2) //check for horizontal line
        {
            for(int i=y1;i<y2;i++)
                canvasArray[x1][i]=d;
        }

        else if(y1==y2) //check for horizontal line
        {
            for(int i=x1;i<x2;i++)
                canvasArray[i][y1]=d;
        }
        else
        {
            System.out.println("Operation not supported");
        }

    }
}
