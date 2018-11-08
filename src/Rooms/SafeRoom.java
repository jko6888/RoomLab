package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class SafeRoom extends Room
    {

    public SafeRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("There was a dog in this room! Your safe to continue!");
        System.out.println(" /^ ^\\\n" +
                "/ 0 0 \\\n" +
                "V\\ Y /V\n" +
                " / - \\\n" +
                " |    \\\n" +
                " || (__V");
    }


}