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
public class Triangle extends TwoDimensionalShape {
    private double base, height;
    
    public Triangle(double base, double height){
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public final void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public final void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return (getBase() * getHeight()) / 2 ;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nBase: %.2f\nHeight: %.2f\n",super.toString(),
                "Triangle",getBase(),getHeight());
    }
    
}
