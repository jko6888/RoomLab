package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class EdmundsRoom extends Room
{

    public EdmundsRoom(int x, int y) {
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
        System.out.println("Edmund is too good at coding! You faint from his greatness!");
        System.out.println(" | _______________ |\n" +
                        " | |XXXXXXXXXXXXX| |\n" +
                        " | |XXXXXXXXXXXXX| |\n" +
                        " | |XXXXXXXXXXXXX| |\n" +
                        " | |XXXXXXXXXXXXX| |\n" +
                        " | |XXXXXXXXXXXXX| |\n" +
                        " |_________________|\n" +
                        "     _[_______]_\n" +
                        " ___[___________]___\n" +
                        "|         [_____] []|__\n" +
                        "|         [_____] []|  \\__\n" +
                        "L___________________J     \\ \\___\\/\n" +
                        " ___________________      /\\\n" +
                        "/###################\\    (__)");
        Runner.gameOff();
    }


}