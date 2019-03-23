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
public class Cube extends ThreeDimensionalShape{
    private double edge;
    public Cube(double edge){
        setEdge(edge);
    }
    public double getEdge() {
        return edge;
    }

    public final void setEdge(double edge) {
        this.edge = edge;
    }
    @Override
    public double getVolume() {
        return Math.pow(getEdge(), 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getEdge(), 2);
    }

    @Override
    public String toString() {
        return String.format("%s %s\nEdge: %.2f\n",super.toString(),"Cube" ,getEdge());
    }
    
    
}
