package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class AlienRoom extends Room
{

    public AlienRoom(int x, int y) {
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
        System.out.println("Aliens abduct you. You lose!");
        System.out.println("           .-\"\"\"\"-.       .-\"\"\"\"-.\n" +
                "          /        \\     /        \\\n" +
                "         /_        _\\   /_        _\\\n" +
                "        // \\      / \\\\ // \\      / \\\\\n" +
                "        |\\__\\    /__/| |\\__\\    /__/|\n" +
                "         \\    ||    /   \\    ||    /\n" +
                "          \\        /     \\        /\n" +
                "           \\  __  /       \\  __  /\n" +
                "   .-\"\"\"\"-. '.__.'.-\"\"\"\"-. '.__.'.-\"\"\"\"-.\n" +
                "  /        \\ |  |/        \\ |  |/        \\\n" +
                " /_        _\\|  /_        _\\|  /_        _\\\n" +
                "// \\      / \\\\ // \\      / \\\\ // \\      / \\\\\n" +
                "|\\__\\    /__/| |\\__\\    /__/| |\\__\\    /__/|\n" +
                " \\    ||    /   \\    ||    /   \\    ||    /\n" +
                "  \\        /     \\        /     \\        /\n" +
                "   \\  __  /       \\  __  /       \\  __  /\n" +
                "    '.__.'         '.__.'         '.__.'\n" +
                "jgs  |  |           |  |           |  |\n" +
                "     |  |           |  |           |  |");
        Runner.gameOff();
    }


}
