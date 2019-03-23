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
public class Square extends TwoDimensionalShape {
    private double length;
    public Square(double length){
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public final void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return Math.pow(getLength(),2);
    }
    @Override
     public String toString() {
        return String.format("%s %s\nLength: %.2f\n",super.toString(),
                "Square",getLength());
    }
}
