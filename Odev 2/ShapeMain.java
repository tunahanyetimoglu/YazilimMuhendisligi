package yazilimmuhendislilab;

import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tuhanan
 */
public class ShapeMain {
    static Shape[] shapes;
    static Scanner sc = new Scanner(System.in);
   
    static String[] TwoDimensionalShapes = {"circle","triangle","square"};
    static String[] ThreeDimensionalShapes = {"tetrahedron","cube","sphere"};
    
    public static void main(String[] args) {
        
    int size = getArraySize();
    boolean flag = false;
    while(!flag){
        if(arraySizeControl(size) == true){
            flag = true;
        }else{
            size = getArraySize();
        }
    } 
        printShapeTypes();
        createShapeArray(size);
        printShapeArray(shapes);
               
    }
    public static int getArraySize(){
        Scanner sc = new Scanner(System.in);  
         try{
                System.out.println("Enter a integer number for size of shape array");
                return sc.nextInt();
        }catch(Exception e){
            System.out.println("Only integer numbers!");
            return 0;
        }   
    }
    public static boolean arraySizeControl(int size){
        if(size <= 0){
            return false;
        }else{
            return true;
        }
    }
    public static void printShapeTypes(){
        System.out.println("\n\t-----\t---\t-----");
        System.out.println("\tShape Type\n\t-----\t---\t-----\n\tTwoDimensionalShape\n\t1-Circle\n"
                            + "\t2-Triange\n\t3-Square\n\tThreeDimensionalShape"
                            + "\n\t1-Cube\n\t2-Sphere\n\t3-Tetrahedron");       
        System.out.println("\n\t-----\t---\t-----\n");
    }
    public static void printShapeArray(Shape[] shapes){
        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensionalShape) {
                System.out.printf("%sArea : %.2f\n",((TwoDimensionalShape) shape).toString(),
                                                    ((TwoDimensionalShape) shape).getArea());
            } else {
                System.out.printf("%sArea : %.2f\nVolume: %.2f\n",((ThreeDimensionalShape) shape).toString(), 
                                                                  ((ThreeDimensionalShape) shape).getArea(),
                                                                  ((ThreeDimensionalShape) shape).getVolume());
            }
        }
    }
    public static void createShapeArray(int size){
        shapes = new Shape[size];
         for(int i = 0; i < size ;){
            System.out.println("Enter shape dimensional (2 - 3).");
            String dimensional = sc.next();
            switch (dimensional) {
                case "2":
                    {
                        System.out.println("Enter shape TwoDimensionalShape Type : ");
                        String type = sc.next().toLowerCase();
                        if(Arrays.stream(TwoDimensionalShapes).anyMatch(type::equals)){
                            switch (type) {
                                case "circle":
                                    shapes[i] = createCircle();
                                    i++;
                                    break;
                                case "triangle":
                                    shapes[i] = createTriangle();
                                    i++;
                                    break;
                                case "square":
                                    shapes[i] = createSquare();
                                    i++;
                                    break;
                                default:
                                    System.out.println("Try again..");
                                    break;
                            }
                        }else{
                            System.out.println("Wrong Type. Try again : " + type);
                        }           break;
                    }
                case "3":
                    {
                        System.out.println("Enter shape ThreeDimensionalShape Type : ");
                        String type = sc.next().toLowerCase();
                        if(Arrays.stream(ThreeDimensionalShapes).anyMatch(type::equals)){
                            switch (type) {
                                case "sphere":
                                    shapes[i] = createSphere();
                                    i++;
                                    break;
                                case "tetrahedron":                                       
                                    shapes[i] = createTetrahedron();
                                    i++;
                                    break;
                                case "cube":                                  
                                    shapes[i] = createCube();
                                    i++;
                                    break;
                                default:
                                    System.out.println("Try again..");
                                    break;
                            }
                        }else{
                            System.out.println("Wrong Type. Try again");
                        }           break;
                    }
                default:
                    System.out.println("Please enter \"2\" or \"3\".");
                    break;
            }
        }
    } 
    public static Circle createCircle(){
        System.out.println("Enter Radius value for Circle: ");
                        double radius = sc.nextDouble();
                        return new Circle(radius);
    }
    public static Triangle createTriangle(){
        System.out.println("Enter heigth value for Triangle: ");
        double height = sc.nextDouble();
        System.out.println("Enter base value for Triangle: ");
        double base = sc.nextDouble();
        return new Triangle(base, height);
    }
    public static Square createSquare(){
        System.out.println("Enter edge value for Square");
        double edge = sc.nextDouble();
        return new Square(edge);
    }
    public static Sphere createSphere(){       
        System.out.println("Enter Radius value for Sphere: ");
        double radius = sc.nextDouble();
        return new Sphere(radius);
    }
    public static Tetrahedron createTetrahedron(){
        System.out.println("Enter edge value for Tetrahedron: ");
        double edge = sc.nextDouble();
        return new Tetrahedron(edge);        
    }
    public static Cube createCube(){
        System.out.println("Enter edge value for Cube");
        double edge = sc.nextDouble();
        return new Cube(edge);
    }
            
}
