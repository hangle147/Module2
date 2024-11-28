package Abstract_Class_Interface.Colorable;

import Abstract_Class_Interface.Resizeable.Resizeable;
import Inherit.Shape.Circle;
import Inherit.Shape.Rectangle;
import Inherit.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Colorable[] colorable = new Colorable[3];

        colorable[0] = new Circle();
        colorable[0].howToColor();
        System.out.println(colorable[0]);

        colorable[1] = new Rectangle();
        colorable[1].howToColor();
        System.out.println(colorable[1]);

        colorable[2] = new Square();
        colorable[2].howToColor();
        System.out.println(colorable[2]);
    }
}
