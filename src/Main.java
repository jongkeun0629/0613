abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius * radius * Math.PI;
    }

//    public void area(){
//        double result =  radius * radius * Math.PI;
//        System.out.println("Circle Area : " + result);
//    }
}

class Rectangle extends Shape{
    private int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

//    public void area(){
//        double result =  width * height
//        System.out.println("Rectangle Area : " + result);
//    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
            // shape.area();
        }

    }
}

