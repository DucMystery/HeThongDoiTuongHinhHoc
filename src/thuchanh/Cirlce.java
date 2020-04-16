package thuchanh;

public class Cirlce extends Shape {

    private double radius;

    public Cirlce(){
        this.radius =1.0;
    }

    public Cirlce(double radius){
        this.radius = radius;
    }

    public Cirlce(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public Cirlce setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    public String toString(){
        return "A circle with radius "+this.radius+" which is a subclass of "+super.toString();
    }

}
