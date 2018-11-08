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
        System.out.println("A zombie bites you! Good Night!");
        System.out.println("                                .....            \n" +
                "                               C C  /            \n" +
                "                              /<   /             \n" +
                "               ___ __________/_#__=o             \n" +
                "              /(- /(\\_\\________   \\              \n" +
                "              \\ ) \\ )_      \\o     \\             \n" +
                "              /|\\ /|\\       |'     |             \n" +
                "                            |     _|             \n" +
                "                            /o   __\\             \n" +
                "                           / '     |             \n" +
                "                          / /      |             \n" +
                "                         /_/\\______|             \n" +
                "                        (   _(    <              \n" +
                "                         \\    \\    \\             \n" +
                "                          \\    \\    |            \n" +
                "                           \\____\\____\\           \n" +
                "                           ____\\_\\__\\_\\          \n" +
                "                         /`   /`     o\\          \n" +
                "                         |___ |_______|.. . b'ger");
        Runner.gameOff();
    }


}