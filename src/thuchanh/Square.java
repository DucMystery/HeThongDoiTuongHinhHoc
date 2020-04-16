package thuchanh;

public class Square extends Rectangle {

    private double size;
    public Square(){
        this.size =1;
    }

    public Square(double size){
        super(size,size);
    }

    public Square(double size,String color,boolean filled){
        super(size,size,color,filled);
    }

    public double getSize() {
        return getWidth();
    }

    public  void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double width){
        setSize(width);
    }
    @Override
    public void setHeight(double height){
        setSize(height);
    }

    @Override
    public String toString(){
        return "A Square width size = "+getSize()+" , which is a subclass of "+super.toString();
    }


}
