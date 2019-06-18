package com.cs;

import com.cs.shape.Shape;
import com.cs.shape.ShapeFactory;
import com.cs.shape.ShapeType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        while(true) {
            System.out.println("enter command : " );
//            String command = scanner.nextLine().trim();
//            switch (command.charAt(0))
//            {
//
//            }



            Canvas c = new Canvas(20,4);

            Shape l = ShapeFactory.getShape(ShapeType.LINE,c);
            l.draw(2,2,2,5,'x');
            l.draw(2,2,5,2,'y');
            Shape r = ShapeFactory.getShape(ShapeType.RECTANGLE,c);
            r.draw(14,1,18,3,'o');

        c.printCanvas();

//        }
    }
}
