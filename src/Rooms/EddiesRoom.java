package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class EddiesRoom extends Room
{

    public EddiesRoom(int x, int y) {
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
        System.out.println("Eddie crushes you with his calves! Your head pops!");
        Runner.gameOff();
    }


}