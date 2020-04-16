import java.util.Arrays;
import java.util.Comparator;

public class TestRectangleCompa {

    public static void main(String[] args) {

        Rectangle [] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(4,5);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(5,6,"red",true);

        System.out.println("Pre -sorted :");

        for (Rectangle rectangle :rectangles){
            System.out.println(rectangle);
        }

        System.out.println("After -sorted:");

        Comparator rectangleComparator =new RectangleCmparator();
        Arrays.sort(rectangles,rectangleComparator);

        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }


    }
}
