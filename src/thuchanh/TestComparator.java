package thuchanh;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {

        Cirlce circles[] = new Cirlce[3];

       circles[0] =new Cirlce(3.6);
       circles[1] =new Cirlce();
       circles[2] =new Cirlce(3.5,"indigo",false);
        System.out.println("Pre-sorted:");
        for (Cirlce cirlce :circles){
            System.out.println(cirlce);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After- sorted:");
        for (Cirlce cirlce :circles){
            System.out.println(cirlce);
        }
    }
}
