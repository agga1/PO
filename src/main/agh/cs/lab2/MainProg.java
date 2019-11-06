package agh.cs.lab2;
import agh.cs.lab3.Animal;
import agh.cs.lab3.OptionsParser;
import agh.cs.lab4.IWorldMap;
import agh.cs.lab4.RectangularMap;
import agh.cs.lab5.GrassField;

import static java.lang.System.out;

public class MainProg {
    public static void main(String[] args) {
        MoveDirection[] directions = new OptionsParser().parse(args);
        IWorldMap map = new RectangularMap(10, 5);
//        out.println(map.place(new Animal(map)));
//        out.println(map.place(new Animal(map,new Vector2d(3,4))));
//        out.println(map.place(new Animal(map,new Vector2d(4,4))));
        out.println(map.place(new Animal(map,new Vector2d(2,2))));
        out.println(map.place(new Animal(map,new Vector2d(3,2))));
        MoveDirection[] md = new MoveDirection[2];
        md[0] = MoveDirection.FORWARD;
        md[1] = MoveDirection.FORWARD;

        map.run(md);
//        map.run(directions);
        out.println(map);

        // unbounded
        IWorldMap unbMap = new GrassField(4);
    }
}
