package org.Rifqi.entity;

public class Triangle {
    private double angleA;
    private double angleB;
   public Triangle (double angleA,double angleB){
       this.angleA= angleA;
       this.angleB=angleB;
   }
   public double getMissingAngle (){
       return 180 - (angleA +angleB);
   }
}
