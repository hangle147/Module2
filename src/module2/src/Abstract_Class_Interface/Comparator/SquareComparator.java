package Abstract_Class_Interface.Comparator;

import Inherit.Shape.Square;

import java.util.Comparator;

public class SquareComparator
        implements Comparator<Square> {
    @Override
    public int compare(Square s1, Square s2) {
        if (s1.getSide() > s2.getSide()) return 1;
        else if (s1.getSide() < s2.getSide()) return -1;
        else return 0;
    }
}
