package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class MonkeyRoom extends Room
{

    public MonkeyRoom(int x, int y) {
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
        System.out.println("You scare a monkey in this room! He bites you!");
        System.out.println("                    .'_|\\     _.--._\n" +
                "                   |_| ` \\---/     ``.\n" +
                "                   | ` .'   .--._____`\\\n" +
                "                    \\ /    /#\"__ _<  \\/\n" +
                "                     |    |#'/  \\| \\\n" +
                "                     |__  |# | '@|'@\n" +
                "                    ,'-.`.|\"  \\_/|_/\n" +
                "                    |   ` \\\\  __<.`)__\n" +
                "    .'~~`.           `.__,|\\\\ \\ `-_` /\n" +
                "  ,' .--. `.            ) '  \\ \\(  `'\n" +
                " / ,'    `. |         _/  ,,  \\ \\_--\n" +
                "(_/       | |        / \\\\/  ``\\\\_/   `-._____\n" +
                "         .' .        |  \\\\    _________<____))\n" +
                "       .' .'        /|   \\\\--'  _____----.`-'\n" +
                "      / .'         / (    >----'  .-<_==='\n" +
                "     / /          |   \\          /\n" +
                "    | .           |____\\        /\n" +
                "    | |             |   \\      /\n" +
                "    | .             |    \\   _/`\n" +
                "     \\ `.         .'|    `\\_(`\\\n" +
                "      `. `~----~~' .'\\    \\    )\n" +
                "        `-._____.-'  |    )   /\n" +
                "                     |   /|  /\n" +
                "-Joshua Bell-        |  / (-<_______\n" +
                "                    _/--`-------____\\\n" +
                "                    `---._  ==='\n" +
                "                         `--'");
        Runner.gameOff();

    }


}