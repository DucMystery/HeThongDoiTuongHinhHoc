import java.util.Comparator;

public class CircleComparator implements Comparator<Cirlce> {
    @Override
    public int compare(Cirlce o1, Cirlce o2) {
        if (o1.getRadius()>o2.getRadius()){
            return 1;
        }else if (o1.getRadius()<o2.getRadius()){
            return -1;
        }else
        return 0;
    }
}
