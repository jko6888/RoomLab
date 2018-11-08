package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class SafeRoom2 extends Room
{

    public SafeRoom2(int x, int y) {
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
        System.out.println("This room is safe! Your safe to continue!");
    }


}