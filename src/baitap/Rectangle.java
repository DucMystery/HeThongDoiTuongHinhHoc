package baitap;

public class Rectangle extends Shape implements Resizeable {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(){
        this.width =1.0;
        this.height =1.0;
    }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        this.width = width;
        this.height =height;
        this.color = color;
        this.filled = filled;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double  getPerimeter(){
        return this.width*2+this.height*2;
    }

    public String toString(){
        return "A Rectangle with width = "+this.width+" and height = "+this.height+" ,which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double precent) {
        this.width+=precent;
        this.height+=precent;
    }
}
