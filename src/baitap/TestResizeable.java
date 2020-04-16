package baitap;

public class TestResizeable {

    public static void main(String[] args) {

        Shape []shapes = new Shape[3];
        shapes[0] = new Cirlce(4,"red",true);
        shapes[1] = new Rectangle(4,5,"Violet",true);
        shapes[2] = new Square(4,"yellow",true);

        for (Shape shape :shapes){
           if (shape instanceof Cirlce){
               Cirlce cirlce = (Cirlce)shape;
                cirlce.resize(6);
           }
            if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(5);
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                square.resize(6);
            }
            System.out.println(shape);
        }


    }
}
