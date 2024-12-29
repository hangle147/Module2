package Abstract_Class_Interface.Resizeable;

import Inherit.Shape.Circle;
import Inherit.Shape.Rectangle;
import Inherit.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];

        resizeables[0] = new Circle();
        resizeables[0].resize(15);
        System.out.println(resizeables[0]);

        resizeables[1] = new Rectangle();
        resizeables[1].resize(15);
        System.out.println(resizeables[1]);

        resizeables[2] = new Square();
        resizeables[2].resize(15);
        System.out.println(resizeables[2]);
    }
}
