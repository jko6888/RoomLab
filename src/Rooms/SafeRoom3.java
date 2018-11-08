package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class SafeRoom3 extends Room
{

    public SafeRoom3(int x, int y) {
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
        System.out.println("There is a cat in this room! Continue your journey!");
        System.out.println("            .                .                    \n" +
                "            :\"-.          .-\";                    \n" +
                "            |:`.`.__..__.'.';|                    \n" +
                "            || :-\"      \"-; ||                    \n" +
                "            :;              :;                    \n" +
                "            /  .==.    .==.  \\                    \n" +
                "           :      _.--._      ;                   \n" +
                "           ; .--.' `--' `.--. :                   \n" +
                "          :   __;`      ':__   ;                  \n" +
                "          ;  '  '-._:;_.-'  '  :                  \n" +
                "          '.       `--'       .'                  \n" +
                "           .\"-._          _.-\".                   \n" +
                "         .'     \"\"------\"\"     `.                 \n" +
                "        /`-                    -'\\                \n" +
                "       /`-                      -'\\               \n" +
                "      :`-   .'              `.   -';              \n" +
                "      ;    /                  \\    :              \n" +
                "     :    :                    ;    ;             \n" +
                "     ;    ;                    :    :             \n" +
                "     ':_:.'                    '.;_;'             \n" +
                "        :_                      _;                \n" +
                "        ; \"-._                -\" :`-.     _.._    \n" +
                "        :_          ()          _;   \"--::__. `.  \n" +
                "         \\\"-                  -\"/`._           :  \n" +
                "        .-\"-.                 -\"-.  \"\"--..____.'  \n" +
                "       /         .__  __.         \\               \n" +
                "      : / ,       / \"\" \\       . \\ ; bug          \n" +
                "       \"-:___..--\"      \"--..___;-\"               \n" +
                "                                                  ");
    }


}