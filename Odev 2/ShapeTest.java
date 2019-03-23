package yazilimmuhendislilab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tuhanan
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Cube(3.0);
        shapes[2] = new Sphere(5.0);
        shapes[3] = new Tetrahedron(3.5);
        shapes[4] = new Triangle(1.5, 2.5);
        shapes[5] = new Square(9.4);

        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensionalShape) {
                System.out.printf("%sArea : %.2f\n", ((TwoDimensionalShape) shape).toString(), shape.getArea());
            } else {
                System.out.printf("%sArea : %.2f\nVolume: %.2f\n", ((ThreeDimensionalShape) shape).toString(), shape.getArea(),
                        ((ThreeDimensionalShape) shape).getVolume());
            }
        }
    }
}
