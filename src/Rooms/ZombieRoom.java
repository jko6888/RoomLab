package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class ZombieRoom extends Room
{

    public ZombieRoom(int x, int y) {
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
        System.out.println("You caught is enraged as he loses in Nitrotype! He punches you. Lose 10 Health.");
    }


}