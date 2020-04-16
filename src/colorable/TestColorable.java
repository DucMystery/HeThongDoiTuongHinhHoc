package colorable;

public class TestColorable {

    public static void main(String[] args) {

        Shape [] shapes = new Shape[3];

        shapes[0] = new Cirlce(5,"red",true);
        shapes[1] = new Square(5,"violet",true);
        shapes[2] = new Rectangle(4,5,"yellow",true);

        for (Shape shape : shapes){
            if (shape instanceof Cirlce) {
                Cirlce cirlce = (Cirlce) shape;
                cirlce.howToString();
            }else
              if (shape instanceof Square){
                Square square =(Square) shape;
                System.out.println(square.getArea());
            }else
              if (shape instanceof Rectangle){
                Rectangle rectangle =(Rectangle) shape;
                System.out.println(rectangle.getArea());
            }
        }
    }
}
