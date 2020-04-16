package baitap;

public class TestShape {

    public static void main(String[] args) {

        Cirlce cirlce1 = new Cirlce(5,"red",true);
        Rectangle rectangle = new Rectangle(5,6,"violet",true);
        Square square1 = new Square(7,"yellow",true);

        System.out.println(square1.toString());
    }
}
