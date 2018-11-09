package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class JamesRoom extends Room
{

    public JamesRoom(int x, int y) {
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
        System.out.println("You see James's grades and stab your eyes out!");
        System.out.println("\n" +
                "   ______________ \n" +
                "  /  |  \\______  \\\n" +
                " /   |  |_  /    /\n" +
                "/    ^   / /    / \n" +
                "\\____   | /____/  \n" +
                "     |__|         \n" +
                "                  \n" +
                "                  \n" +
                "                  \n" +
                "                  \n" +
                "                  \n" +
                "                  \n");
        Runner.gameOff();
    }


}