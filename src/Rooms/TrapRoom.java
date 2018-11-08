package Rooms;

import Game.Runner;
import People.Person;
import Game.Board;

public class TrapRoom extends Room
{

	public TrapRoom(int x, int y) {
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
		System.out.println("You activated my trap card. You lose!");
		System.out.println("|           )._______.-'\n" +
						"`----------'  BP");
		Runner.gameOff();
	}


}
