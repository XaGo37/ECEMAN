package ECEMAN;

import java.util.Scanner;

public class Level {

    //Pour reset créer une map reset

    private Map map;
    private Perso perso;
    private boolean isDone = false;
    private boolean isOver = false;

    public Level(Map map, Perso perso) {
        this.map = map;
        this.perso = perso;

        System.out.print(map.getLayer(0).getSizeX());
        System.out.print(map.getLayer(0).getSizeY());

        for (int i = 0; i < map.getLayer(0).getSizeY(); i++) {
            for (int j = 0; j <  map.getLayer(0).getSizeX(); j++) {
                if(map.getLayer(0).getCase(i,j) == 'P'){
                    perso.setCoords(i,j);
                }
            }
        }
    }

    public void movePerso(char direction) {

        int tempPosX = perso.getxPerso();
        int tempPosY = perso.getyPerso();
        char tempCurrentCase = perso.getCurrentCase();
        boolean playerMoved = false;


        switch (direction) {
            case 'z':
                if (testBlock(perso.getxPerso() - 1, perso.getyPerso())) {
                    perso.setCurrentCase(map.getLayer(0).getCase(tempPosX - 1, tempPosY));
                    perso.setyPerso(perso.getxPerso() - 1);
                    map.getLayer(0).setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
            case 's':
                if (testBlock(perso.getxPerso() + 1, perso.getyPerso())) {
                    perso.setCurrentCase(map.getLayer(0).getCase(tempPosX + 11, tempPosY));
                    perso.setyPerso(perso.getxPerso() + 1);
                    map.getLayer(0).setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
            case 'q':
                if (testBlock(perso.getxPerso(), perso.getyPerso() - 1)) {
                    perso.setCurrentCase(map.getLayer(0).getCase(tempPosX, tempPosY - 1));
                    perso.setyPerso(perso.getyPerso() - 1);
                    map.getLayer(0).setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
            case 'd':
                if (testBlock(perso.getxPerso(), perso.getyPerso() + 1)) {
                    perso.setCurrentCase(map.getLayer(0).getCase(tempPosX, tempPosY + 1));
                    perso.setyPerso(perso.getyPerso() + 1);
                    map.getLayer(0).setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
        }
        if(playerMoved == true && perso.getCurrentCase() == 'T'){
            teleportPerso(perso.getxPerso(), perso.getyPerso());

        }
        if(playerMoved == true){
            changeCase(tempCurrentCase,tempPosX,tempPosY);
        }

        Affichage.afficher(map,perso);

    }


    private void changeCase(char currentCase, int x, int y){
        switch(currentCase){
            case 'o' :
                map.getLayer(0).setCase(x,y,' ');
                break;
            case 'X' :
                map.getLayer(0).setCase(x,y,'o');
                break;
            case 'T' :
                map.getLayer(0).setCase(x,y,'t');
                break;
            default :
                map.getLayer(0).setCase(x,y,currentCase);
                break;

        }
    }

    public void teleportPerso(int x, int y) {
        int tempPosX = perso.getxPerso();
        int tempPosY = perso.getyPerso();
        changeCase('T', tempPosX,tempPosY);
        for (int i = 0; i < map.getLayer(0).getSizeY(); i++) {
            for (int j = 0; j < map.getLayer(0).getSizeX(); j++) {
                if (map.getLayer(0).getCase(i, j) == 'T' && !(i == x && j==y)) {
                    perso.setCoords(i, j);
                    map.getLayer(0).setCase(perso.getxPerso(), perso.getyPerso(), 'P');

                }
            }
        }
    }

    private boolean testBlock(int x, int y) {
        for (PassableBlocks passBlock : PassableBlocks.values()) {
            System.out.println(map.getLayer(0).getCase(x, y));
            //Creer boucle for pour chaque Layer getLayer(i) , taille layer
            if (map.getLayer(0).getCase(x, y) == passBlock.asChar()) {
                return true;
            }
        }
        return false;
    }
}
