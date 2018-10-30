package Rooms;

import Game.Runner;
import People.Person;

public class KevinsRoom extends Room
{

    public KevinsRoom(int x, int y) {
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
        System.out.println("There was a zombie in this room! You lose 10 health");
    }


}