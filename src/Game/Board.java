package Game;

import Rooms.Room;
import Rooms.WinningRoom;
import Game.Runner;
import People.Person;

public class Board {
    static int hori;
    static int vert;
    public static String[][] mapForm;
    public static String[][] mapBorder;


    public Board(int hori, int vert) {
        this.hori = hori;
        this.vert = vert;
    }

    public static Room[][] formation() {
        Room[][] building = new Room[hori][vert];

        for (int i = 0; i < building.length; i++) {
            for (int j = 0; j < building[i].length; j++) {
                building[i][j] = new Room(i, j);
            }
        }

        int x = (int) (Math.random() * building.length);
        int y = (int) (Math.random() * building.length);
        building[x][y] = new WinningRoom(x, y);

        return building;
    }

    public static void createPlaySpace() {
        mapForm = new String[hori][vert];
        mapBorder = new String[hori][vert];
        for (int i = 0; i < mapForm.length; i++) {
            for (int j = 0; j < mapForm[i].length; j++) {
                mapForm[i][j] = "[";
            }
        }
    }
}