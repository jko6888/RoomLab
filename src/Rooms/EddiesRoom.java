package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class EddiesRoom extends Room
{

    public EddiesRoom(int x, int y) {
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
        System.out.println("Eddie crushes you with his calves! Your head pops!");
        System.out.println(" _____________\n" +
                " MMMMMMMMMMMMMMMgggg,,,,__ \n" +
                " \"\"\"????YYMMMMMMMMMMMMMMMMMb,   .,gggg,,\n" +
                "      \"\";;\"\"++??MMMMMMMMMMMYYY++\"\"`+MMMMMb,\n" +
                "      .';'      `\"?;\"\"              `MMMMMMb.\n" +
                "    +' ;'       .;'                  ;MMMMMMMb.\n" +
                "       ;      .;;______               ;MMMMMMMMb\n" +
                "   ;'        ;'      ``\"\"\"`\"\"\"\"\"\"'\";,  ;MMMMMMMMb___________________________\n" +
                "  '         ;'                      `; `;;;;$''?$b\n" +
                "    ;'     ;'                         ; ;?'`;   ?$.\n" +
                "   ;'      ;                           ;;.  `;   $b\n" +
                "  ,,,,     `;                           ;;   `;  `;}\n" +
                "  ;;;;;;;;gg$iggg..,,,...+++\"\"t.         `.   `..;'\n" +
                "  ;;;;;;;;;;;;;\"\"\"    t        ;;         `;  ;;'                         \n" +
                "  ;;;;;;;;\" t          ;       ;,;          +;'                           \n" +
                "  ;\"\"\"\"     `t          t        ;;          `;.                           \n" +
                "              t          ;        ,`.          `+.\n" +
                "  t           `t          t       `;;;.          `+\n" +
                "  tt            t          ;      .;'`;`+.         `+.\n" +
                "  `tt           `t          t   ,;''   ;  `+.        `;.\n" +
                "   `tt            t          ;,;'      ),   `;+.       `;.\n" +
                "    `tt           `t        ;;''      /$$;.   +.``+._     `;.\n" +
                "     `tt            t    ,;;'        (b.?$$bg, `;    `;      `;.\n" +
                "      `t,           `t ,;;'          |?\"\"\"`?s,?gf?.   {\\.       ;.\n" +
                "       `t,           ,;;             ||     `?bgg$$$$b \\`\\.      `;.\n" +
                "        `t,       ,;;'               `'       `--\"\"     \\Y\"i.       )b,_\n" +
                "         `t,   ,,;;''                                    \\\\\"t?gggggd?'\"dbn,\n" +
                "          `t,,;;'                                         '  `?$gggggd$$$$$?\n" +
                "          ,;;'                                                   \"\"\"\"\"\"\"\"''\n" +
                " \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        Runner.gameOff();
    }


}