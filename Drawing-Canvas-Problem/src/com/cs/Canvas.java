package com.cs;

public class Canvas {

    char[][] canvasArray;
    int width,height;

    public Canvas(int width, int height)
    {
        this.width=width;
        this.height=height;
        canvasArray = new char[height+2][width+1];
        for(int i=0;i<=height+1;i++)
        {
            for(int j=0;j<=width;j++)
            {
                canvasArray[i][j] = ' ';

            }
        }
        for(int i=0;i<width;i++)
        {
            canvasArray[0][i] = '-';
            canvasArray[height+1][i] = '-';

        }
        for(int j=1;j<=height;j++)
        {
            canvasArray[j][0] = '|';
            canvasArray[j][width-1] = '|';

        }

    }

    public char[][] getCanvasArray()
    {
        return this.canvasArray;
    }

    public void printCanvas()
    {
        for(int i=0;i<=height+1;i++)
        {
            for(int j=0;j<=width;j++)
            {
                System.out.print(canvasArray[i][j]);
            }
            System.out.print("\n");

        }

    }
}
