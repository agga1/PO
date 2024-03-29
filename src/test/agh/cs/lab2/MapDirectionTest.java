package agh.cs.lab2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MapDirectionTest {
    private MapDirection mdNorth = MapDirection.NORTH;
    private MapDirection mdSouth = MapDirection.SOUTH;
    private MapDirection mdEast = MapDirection.EAST;
    private MapDirection mdWest = MapDirection.WEST;
    @Test
    public void nextTest(){
        assertSame(mdEast.next(), mdSouth);
        assertSame(mdNorth.next(),mdEast);
        assertSame(mdSouth.next(), mdWest);
        assertSame(mdWest.next(), mdNorth);
    }
    @Test
    public void previousTest(){
        assertSame(mdEast.previous(), mdNorth);
        assertSame(mdNorth.previous(), mdWest);
        assertSame(mdSouth.previous(), mdEast);
        assertSame(mdWest.previous(), mdSouth);
    }
}
