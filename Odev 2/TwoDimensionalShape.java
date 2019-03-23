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
public abstract class TwoDimensionalShape extends Shape {
    @Override
    public abstract double getArea();
     public String toString(){
        return"TwoDimensionalShape -";
    }
}