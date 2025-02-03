package org.Rifqi;

import org.Rifqi.entity.*;

import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Rectangle
        Rectangle rectangle = new Rectangle(5, 3);
        double rectangleArea = rectangle.getArea();
        System.out.printf("Area of Rectangle %.1f\n", rectangleArea);
        //Circle
        Circle circle = new Circle(5);
        System.out.printf("Circle Diameter : %.1f\n", circle.getDiameter());
        System.out.printf("Circle Area : %.3f\n", circle.getArea());
        System.out.printf("Circle Circumference : %.3f\n", circle.getCircumference());
        //Triangle
        Triangle triangle = new Triangle(80, 65);
        System.out.printf("Missing Angle = %.1f\n", triangle.getMissingAngle());
        //Date
        Date date = new Date(LocalDate.of(2024, 04, 19), LocalDate.of(2024, 03, 21));
        System.out.println("Difference of date is : " + date.calculateDate() + " Days");
        //Initial
        Initial initial = new Initial("john Doe");
        char[] initials = initial.getInitial();
        System.out.println("Initials : " + new String(initials));


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");


    }
}