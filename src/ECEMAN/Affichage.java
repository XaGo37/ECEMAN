package ECEMAN;

public class Affichage {

    public static void afficher(Map map, Perso perso){
        for (int i = 0; i < map.getLayer(0).getSizeY(); i++) {
            for (int j = 0; j <  map.getLayer(0).getSizeX(); j++) {
                if(perso.getxPerso()== i && perso.getyPerso()== j){
                    System.out.print('8');
                }
                else System.out.print(map.getLayer(0).getCase(i,j));
                }
            System.out.println();
            }
        }
    }