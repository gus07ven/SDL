// A class that doesn't follow the Open/Closed principle
//public class Rectangle(){
//    public double length;
//    public double width;
//}
//
//public class Circle(){
//    public double radius;
//}

////As new shapes are added, the class keeps changing. Design is not closed for modifications.
//// This design is not extensible because we keep adding functionality little by little to AreaCalculator.
//public class AreaCalculator(){
//
//    public double calculateRectangleArea(Rectangle rectangle){
//        return rectangle.length * rectangle.width;
//        }
//
//    public double calculateCircleArea(Circle circle){
//        return (22/7) * circle.radius * circle.radius;
//        }
//}

// Design changes to make Shape extensible.
// Base interface Shape
public interface Shape(){

    // Abstract method calculate area
    public double calculcateArea(){
        }
}

public class Rectangle implements Shape {
    public double length;
    public double width;

    public double calculateArea(){
        return length * width;
    }
}

public class Circle implements Shape {
    public double radius;

    public double calculateArea(){
        return (22/7) * radius * radius;
    }
}

public class AreaCalculator{
    public double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }
}