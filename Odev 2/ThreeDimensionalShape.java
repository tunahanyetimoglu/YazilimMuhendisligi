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
public abstract class ThreeDimensionalShape extends Shape {
    public abstract double getVolume();
    @Override
    public abstract double getArea();

    @Override
    public String toString() {
        return "ThreeDimensionalShape - ";
    }
    
}
