package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class JackBoxRoom extends Room
{

    public JackBoxRoom(int x, int y) {
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
        System.out.println("A Jack Box scares you! You faint!");
        System.out.println("      0_\n" +
                "       \\`.     ___\n" +
                "        \\ \\   / __>0\n" +
                "    /\\  /  |/' / \n" +
                "   /  \\/   `  ,`'--.\n" +
                "  / /(___________)_ \\\n" +
                "  |/ //.-.   .-.\\\\ \\ \\\n" +
                "  0 // :@ ___ @: \\\\ \\/\n" +
                "    ( o ^(___)^ o ) 0\n" +
                "     \\ \\_______/ /\n" +
                " /\\   '._______.'--.\n" +
                " \\ /|  |<_____>    |\n" +
                "  \\ \\__|<_____>____/|__\n" +
                "   \\____<_____>_______/\n" +
                "       |<_____>    |\n" +
                "       |<_____>    |\n" +
                "       :<_____>____:\n" +
                "      / <_____>   /|\n" +
                "     /  <_____>  / |\n" +
                "    /___________/  |\n" +
                "    |           | _|__\n" +
                "    |           | ---||_\n" +
                "    |   |L\\/|/  |  | [__]\n" +
                "    |  \\|||\\|\\  |  /\n" +
                "jgs =|           | /\n" +
                "    |___________|/");
        Runner.gameOff();
    }


}