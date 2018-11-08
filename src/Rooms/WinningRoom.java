package Rooms;

import Game.Runner;
import People.Person;


public class WinningRoom extends Room
{

    public WinningRoom(int x, int y) {
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
        System.out.println("You found the key! You Win!");
        System.out.println("  ooo,    .---.\n" +
                " o`  o   /    |\\________________\n" +
                "o`   'oooo()  | ________   _   _)\n" +
                "`oo   o` \\    |/        | | | |\n" +
                "  `ooo'   `---'         \"-\" |_|\n" +
                "                                ");
        Runner.gameOff();
    }


}