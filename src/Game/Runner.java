package Game;


import People.Person;
import Rooms.Room;
import Rooms.KevinsRoom;
import Rooms.TrapRoom;
import Rooms.JackiesRoom;
import Rooms.AzarulsRoom;
import Rooms.EdmundsRoom;
import Rooms.ZombieRoom;
import Rooms.WinningRoom;
import Rooms.WilliamsRoom;
import Rooms.EddiesRoom;
import Rooms.SafeRoom;
import Rooms.JamesRoom;
import Rooms.SafeRoom1;
import Rooms.SafeRoom2;
import Rooms.SafeRoom3;
import Rooms.MonkeyRoom;
import Rooms.JackBoxRoom;
import Rooms.SafeRoom4;
import Rooms.SafeRoom5;
import Rooms.AlienRoom;

import java.util.Scanner;

public class Runner {

	private static boolean gameOn = true;

	public static void main(String[] args)
	{

		System.out.println("Background info:You are stuck in the a house and the only way out is to find the key. Watch out for traps and Kevin.\n");
		System.out.println("Move west(a), east(d), north(w), south(s) to progress\n");
		System.out.println("The rooms you visited(0) and the rooms that are unknown([)\n");

		Scanner in = new Scanner(System.in);
		Board layout = new Board(10,10);
		Room[][] building = layout.formation();
		layout.createPlaySpace();

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

		int x6 = (int)(Math.random()*building.length);
		int y6 = (int)(Math.random()*building.length);
		building[x6][y6] = new WinningRoom(x6, y6);

		int x7 = (int)(Math.random()*building.length);
		int y7 = (int)(Math.random()*building.length);
		building[x7][y7] = new WilliamsRoom(x7, y7);

		int x8 = (int)(Math.random()*building.length);
		int y8 = (int)(Math.random()*building.length);
		building[x8][y8] = new EddiesRoom(x8, y8);

		int x9 = (int)(Math.random()*building.length);
		int y9 = (int)(Math.random()*building.length);
		building[x9][y9] = new SafeRoom(x9, y9);

		int x10 = (int)(Math.random()*building.length);
		int y10 = (int)(Math.random()*building.length);
		building[x10][y10] = new JamesRoom(x10, y10);

		int x11 = (int)(Math.random()*building.length);
		int y11 = (int)(Math.random()*building.length);
		building[x11][y11] = new SafeRoom1(x11, y11);

		int x12 = (int)(Math.random()*building.length);
		int y12 = (int)(Math.random()*building.length);
		building[x12][y12] = new SafeRoom2(x12, y12);

		int x13 = (int)(Math.random()*building.length);
		int y13 = (int)(Math.random()*building.length);
		building[x13][y13] = new SafeRoom3(x13, y13);

		int x14 = (int)(Math.random()*building.length);
		int y14 = (int)(Math.random()*building.length);
		building[x14][y14] = new MonkeyRoom(x14, y14);

		int x15 = (int)(Math.random()*building.length);
		int y15 = (int)(Math.random()*building.length);
		building[x15][y15] = new JackBoxRoom(x15, y15);

		int x16 = (int)(Math.random()*building.length);
		int y16 = (int)(Math.random()*building.length);
		building[x16][y16] = new SafeRoom4(x16, y16);

		int x17 = (int)(Math.random()*building.length);
		int y17 = (int)(Math.random()*building.length);
		building[x17][y17] = new SafeRoom5(x17, y17);

		int x18 = (int)(Math.random()*building.length);
		int y18 = (int)(Math.random()*building.length);
		building[x18][y18] = new AlienRoom(x18, y18);

		//Setup player 1 and the input scanner
		System.out.println("What's your first name?");
		String firstName = in.nextLine();
		System.out.println("Last name?");
		String lastName = in.nextLine();
		Person player1 = new Person(firstName, lastName, 0,0);
		System.out.println("You're probably going to lose " + firstName + " " + lastName);
		System.out.println("Now make your move");
		building[0][0].enterRoom(player1);
		while(gameOn)
		{

			String move = in.nextLine();
			if(makeMove(move, player1, building))
		{
			System.out.println("");
		}
			if(move.toLowerCase().equals("w") || move.toLowerCase().equals("a") || move.toLowerCase().equals("s") || move.toLowerCase().equals("d"))
			{
				String[][] whereIam = new String[][]{};
				String surround = "";
				for (int i = 0; i < building.length; i++)
				{
					for (int j = 0; j < building.length; j++)
					{
						if ((i == player1.getxLoc() && j == player1.getyLoc()))
						{
							Board.mapForm[i][j] = "0";
							Board.mapForm[0][0] = "0";
						}
					}
				}
				for(String[] hori : Board.mapForm){
					for(String vertical: hori){
						surround += vertical;
					}
					surround += "\n";
				}
				System.out.println(surround);

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
	public static boolean makeMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					if(Board.mapForm[p.getxLoc() - 1][p.getyLoc()].equals("["))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc() - 1][p.getyLoc()].enterRoom(p);

					}
					else if(Board.mapForm[p.getxLoc() - 1][p.getyLoc()].equals("0"))
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
					if(Board.mapForm[p.getxLoc()][p.getyLoc() - 1].equals("["))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
					}
					else if(Board.mapForm[p.getxLoc()][p.getyLoc() - 1].equals("0"))
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
					 if(Board.mapForm[p.getxLoc() + 1][p.getyLoc()].equals("["))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc() + 1][p.getyLoc()].enterRoom(p);
					}
					else if(Board.mapForm[p.getxLoc() + 1][p.getyLoc()].equals("0"))
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
					if(Board.mapForm[p.getxLoc()][p.getyLoc() + 1].equals("["))
					{
						map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
						map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					}
					else if(Board.mapForm[p.getxLoc()][p.getyLoc() + 1].equals("0"))
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
