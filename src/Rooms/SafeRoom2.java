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
        System.out.println("There is cake in this room! You're safe to continue!");
        System.out.println("      $$  $$  $$\n" +
                "    __||__||__||__\n" +
                "   | * * * * * * *|\n" +
                "   |* * * * * * * |\n" +
                "MT | * * * * * * *|\n" +
                "   |______________|");
    }


}