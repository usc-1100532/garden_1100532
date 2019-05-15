package garden_planner.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleBedTest {
    @Test
    void getDiameter() {
        CircleBed c1 = new CircleBed(4);
        assertEquals(4,4);
    }
    @Test
    void getArea() {
        CircleBed c1 = new CircleBed(2);
        assertEquals(3.14,3.14);
    }
    @Test
    void getPerimeter() {
        CircleBed c1 = new CircleBed(2);
        assertEquals(6.28,6.28);
    }
    @Test
    void toString1() {
        CircleBed c1 = new CircleBed(2);
        assertEquals("Circle 0.00 0.00 2.00 ", c1.toString());
    }
}
