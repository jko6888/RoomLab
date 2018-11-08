package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

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
        System.out.println("Kevin's Devil Horns appear! Your eyes disintegrate!");
        System.out.println(" .-._                                                   _,-,\n" +
                "  `._`-._                                           _,-'_,'\n" +
                "     `._ `-._                                   _,-' _,'\n" +
                "        `._  `-._        __.-----.__        _,-'  _,'\n" +
                "           `._   `#===\"\"\"           \"\"\"===#'   _,'\n" +
                "              `._/)  ._               _.  (\\_,'\n" +
                "               )*'     **.__     __.**     '*( \n" +
                "               #  .==..__  \"\"   \"\"  __..==,  # \n" +
                "Deelkar        #   `\"._(_).       .(_)_.\"'   #");
        Runner.gameOff();
    }


}