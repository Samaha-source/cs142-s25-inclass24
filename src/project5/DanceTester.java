package project5;

// PUT YOUR HEADER HERE

import java.util.ArrayList;

public class DanceTester {
    public static void main(String[] args) {
        testBoredBug(); // click the canvas when it appears to start the bug dancing!
    }

    public static void testBoredBug() {
        DanceFloor floor = new DanceFloor(3, 5);
        BoredBug boredbug = new BoredBug(1, 2);
        floor.addDancer(boredbug);
        floor.everyoneDance();
    }

}
