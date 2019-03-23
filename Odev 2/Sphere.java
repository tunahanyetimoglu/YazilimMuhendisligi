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
public class Sphere extends ThreeDimensionalShape {

    private double radius;
    public Sphere(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getVolume() {
        double v = 4 / 3 ;
        return (v * Math.PI) * (Math.pow(getRadius(),3));
    }

    @Override
    public double getArea() {
         return ( 4 * Math.PI) * (Math.pow(getRadius(), 2));
    }
    @Override
     public String toString() {
        return String.format("%s %s\nRadius: %.2f\n",super.toString(),"Sphere",getRadius());
    }
    
}
