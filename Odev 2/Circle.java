/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazilimmuhendislilab;

/**
 *
 * @author tuhanan
 */
public  class Circle extends TwoDimensionalShape {
    private double radius; // YARI ÇAP
    private final double PI = Math.PI;
    public Circle(double radius){
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
       return PI * (Math.pow(radius,2));
       // return PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nRadius: %.2f\n",super.toString(),"Circle",getRadius());
    }
    
}
