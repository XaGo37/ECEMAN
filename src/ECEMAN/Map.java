package ECEMAN;

import java.util.ArrayList;

public class Map {
    private char[][] map;

    public Map(char[][]map){
        this.map = map;
    }
    public char getCase(int x, int y){
        return map[x][y];
    }
    public int getSizeX(){
        return map[1].length;
    }
    public int getSizeY(){
        return map.length;
    }
    public void setCase(int x, int y, char carCase){
        map[x][y] = carCase;
    }


}


