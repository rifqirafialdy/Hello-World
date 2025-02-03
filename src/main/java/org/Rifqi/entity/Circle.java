package org.Rifqi.entity;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
}
