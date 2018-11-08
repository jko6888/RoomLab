package Rooms;

import Game.Runner;
import People.Person;

public class WilliamsRoom extends Room
{

    public WilliamsRoom(int x, int y) {
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
        System.out.println("You see William! You kill yourself!");
        Runner.gameOff();
    }


}