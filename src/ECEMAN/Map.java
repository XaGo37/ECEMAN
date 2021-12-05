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

    /*  private ArrayList<Layer> Layers; //Tableau de Layer


    public Map(ArrayList<Layer> Layers){
        this.Layers = new ArrayList<>(Layers);
    }
    public Layer getLayer(int index){
        return Layers.get(index);
    }
    public ArrayList<Layer> getLayers() {
        return Layers;
    }
    public void setLayers(ArrayList<Layer> layers) {
        Layers = layers;
    }*/

}


