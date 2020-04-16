package Comparable;

import java.util.Arrays;

public class TestCompareTo {

    public static void main(String[] args) {

        ComparableCircle []comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle(3.5,"red",true);

        System.out.println("Pre-sorted :");
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }

        System.out.println("After -sorted :");

        Arrays.sort(comparableCircles);
        for (ComparableCircle comparableCircle :comparableCircles){
            System.out.println(comparableCircle);
        }
    }
}
