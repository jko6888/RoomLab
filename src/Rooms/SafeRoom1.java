package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class SafeRoom1 extends Room
{

    public SafeRoom1(int x, int y) {
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
        System.out.println("This room is filled with flowers! You're safe to continue!");
        System.out.println("         wWWWw               wWWWw\n" +
                "   vVVVv (___) wWWWw         (___)  vVVVv\n" +
                "   (___)  ~Y~  (___)  vVVVv   ~Y~   (___)\n" +
                "    ~Y~   \\|    ~Y~   (___)    |/    ~Y~\n" +
                "    \\|   \\ |/   \\| /  \\~Y~/   \\|    \\ |/\n" +
                "   \\\\|// \\\\|// \\\\|/// \\\\|//  \\\\|// \\\\\\|///\n" +
                "jgs^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }


}