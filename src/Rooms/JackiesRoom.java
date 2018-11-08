package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class JackiesRoom extends Room
{

    public JackiesRoom(int x, int y) {
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
        System.out.println("Jackie is enraged at his typing speed, so he throws a keyboard at you! Your head smashes open!");
        Runner.gameOff();
    }


}
