package javabasic.day09.Demo4;

public class Demo2 {
    public static void main(String[] args) {
        Round round = new Round();
        round.r = 3.0;
        System.out.println("round的周长： " + round.getPerimeter());
        System.out.println("round的面积： " + round.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.height = 10.0;
        rectangle.length = 10.0;
        System.out.println("rectangle的周长是 " + rectangle.getPerimeter());
        System.out.println("rectangle的面积是 " + rectangle.getArea());
    }
}

abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Rectangle extends Shape{
    double length;
    double height;

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }

    @Override
    public double getArea() {
        return length * height;
    }
}

class Round extends Shape{
    double r;

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}