package ECEMAN;

import java.util.ArrayList;

public class Map {
    private ArrayList<Layer> Layers; //Tableau de Layer


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
    }

    //get one layer

}


