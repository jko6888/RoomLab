package Game;


import People.Person;
import Rooms.Room;
import Rooms.KevinsRoom;
import Rooms.TrapRoom;
import Rooms.JackiesRoom;
import Rooms.AzarulsRoom;
import Rooms.EdmundsRoom;
import Rooms.ZombieRoom;


import java.util.Scanner;

public class Runner {

	private static boolean gameOn = true;

	public static void main(String[] args)
	{

		System.out.println("Background info:You are stuck in the a house and the only way out is to find the key. Watch out for traps and Kevin.\n");
		System.out.println("Move west(a), east(d), north(w), south(s) to progress\n");

		Scanner in = new Scanner(System.in);
		Board layout = new Board(10,10);
		Room[][] building = layout.generate();
		layout.createTemplate();

		//Create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new TrapRoom(x, y);
		int x1 = (int)(Math.random()*building.length);
		int y1 = (int)(Math.random()*building.length);
		building[x1][y1] = new KevinsRoom(x1, y1);
		int x2 = (int)(Math.random()*building.length);
		int y2 = (int)(Math.random()*building.length);
		building[x2][y2] = new JackiesRoom(x2, y2);
		int x3 = (int)(Math.random()*building.length);
		int y3 = (int)(Math.random()*building.length);
		building[x3][y3] = new AzarulsRoom(x3, y3);
		int x4 = (int)(Math.random()*building.length);
		int y4 = (int)(Math.random()*building.length);
		building[x4][y4] = new EdmundsRoom(x4, y4);
		int x5 = (int)(Math.random()*building.length);
		int y5 = (int)(Math.random()*building.length);
		building[x5][y5] = new ZombieRoom(x5, y5);
		//Setup player 1 and the input scanner
		System.out.println("So what's your first name?");
		String firstName = in.nextLine();
		System.out.println("Last name?");
		String lastName = in.nextLine();
		Person player1 = new Person(firstName, lastName, 0,0);
		System.out.println("Well, good luck, " + firstName + " " + lastName);
		building[0][0].enterRoom(player1);
		while(gameOn)
		{

			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("Invalid Move");
			}
			if(move.toLowerCase().equals("w") || move.toLowerCase().equals("a") || move.toLowerCase().equals("s") || move.toLowerCase().equals("d"))
			{
				String[][] Player1Location = new String[][]{};
				String mapPopulate = "";
				for (int i = 0; i < building.length; i++)
				{
					for (int j = 0; j < building.length; j++)
					{
						if ((i == player1.getxLoc() && j == player1.getyLoc()))
						{
							Board.mapForm[i][j] = "!";
							Board.mapForm[0][0] = "!";
						}
					}
				}
				for(String[] row : Board.mapForm){
					for(String column: row){
						mapPopulate += column;
					}
					mapPopulate += "\n";
				}
				System.out.println(mapPopulate);

			}



		}
		in.close();
	}


	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					if (Board.mapBorder[p.getxLoc() - 1][p.getyLoc()].equals("|"))
					{
						System.out.println("Stop hitting yourself?");
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc()].enterRoom(p);
						Board.mapForm[p.getxLoc() - 1][p.getyLoc()] = "|";
					}
					else if(Board.mapForm[p.getxLoc() - 1][p.getyLoc()].equals("?"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);

					}
					else if(Board.mapForm[p.getxLoc() - 1][p.getyLoc()].equals("!"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);
					}
					return true;
				}
				else
				{
					return false;
				}
			case "a":
				if (p.getyLoc() > 0)
				{
					if(Board.mapBorder[p.getxLoc()][p.getyLoc() - 1].equals("|"))
					{
						System.out.println("Bam! You hit the wall?");
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc()].enterRoom(p);
						Board.mapBorder[p.getxLoc()][p.getyLoc() - 1] = "|";
					}
					else if(Board.mapForm[p.getxLoc()][p.getyLoc() - 1].equals("?"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
					}
					else if(Board.mapForm[p.getxLoc()][p.getyLoc() - 1].equals("!"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
					}
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					if(Board.mapBorder[p.getxLoc() + 1][p.getyLoc()].equals("|"))
					{
						System.out.println("How did you run into a wall?");
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc()].enterRoom(p);
						Board.mapForm[p.getxLoc() + 1][p.getyLoc()] = "|";
					}
					else if(Board.mapForm[p.getxLoc() + 1][p.getyLoc()].equals("?"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
					}
					else if(Board.mapForm[p.getxLoc() + 1][p.getyLoc()].equals("!"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
					}
					return true;
				}
				else
				{
					return false;
				}

			case "d":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					if(Board.mapBorder[p.getxLoc()][p.getyLoc() + 1].equals("|"))
					{
						System.out.println("Are you even looking at where you're going?");
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc()].enterRoom(p);
						Board.mapForm[p.getxLoc()][p.getyLoc() + 1] = "|";
					}
					else if(Board.mapForm[p.getxLoc()][p.getyLoc() + 1].equals("?"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					}
					else if(Board.mapForm[p.getxLoc()][p.getyLoc() + 1].equals("!"))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					}
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;

		}
		return true;
	}

	public static void gameOff()
	{
		gameOn = false;
	}



}
