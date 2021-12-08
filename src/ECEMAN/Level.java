package ECEMAN;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Level  {

    private Map map;
    private Perso perso;
    private Enemy enemy;
    private boolean isDone = false;
    private boolean isOver = false;

    public Level(Map map, Perso perso) {
        this.map = map;
        this.perso = perso;

        for (int i = 0; i < map.getSizeY(); i++) {
            for (int j = 0; j <  map.getSizeX(); j++) {
                if(map.getCase(i,j) == 'P'){
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
                    perso.setCurrentCase(map.getCase(tempPosX - 1, tempPosY));
                    perso.setxPerso(perso.getxPerso() - 1);
                    map.setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
            case 's':
                if (testBlock(perso.getxPerso() + 1, perso.getyPerso())) {
                    perso.setCurrentCase(map.getCase(tempPosX + 1, tempPosY));
                    perso.setxPerso(perso.getxPerso() + 1);
                    map.setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
            case 'q':
                if (testBlock(perso.getxPerso(), perso.getyPerso() - 1)) {
                    perso.setCurrentCase(map.getCase(tempPosX, tempPosY - 1));
                    perso.setyPerso(perso.getyPerso() - 1);
                    map.setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
                break;
            case 'd':
                if (testBlock(perso.getxPerso(), perso.getyPerso() + 1)) {
                    perso.setCurrentCase(map.getCase(tempPosX, tempPosY + 1));
                    perso.setyPerso(perso.getyPerso() + 1);
                    map.setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                    playerMoved = true;
                }
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
        if(perso.isIslight()==true){
            map.setCase(x,y,currentCase);
            return;
        }
        switch(currentCase){
            case 'o' :
                map.setCase(x,y,' ');
                break;
            case 'X' :
                map.setCase(x,y,'o');
                break;
            case 'T' :
                map.setCase(x,y,'t');
                break;
            case 'L' :
                map.setCase(x,y,'o');
                perso.setIslight(true);
                break;
            case 'Z':
                break;
            default :
                map.setCase(x,y,currentCase);
                break;
        }
    }

    private void teleportPerso(int x, int y) {
        int tempPosX = perso.getxPerso();
        int tempPosY = perso.getyPerso();
        changeCase('T', tempPosX,tempPosY);
        for (int i = 0; i < map.getSizeY(); i++) {
            for (int j = 0; j < map.getSizeX(); j++) {
                if (map.getCase(i, j) == 'T' && !(i == x && j==y)) {
                    perso.setCoords(i, j);
                    map.setCase(perso.getxPerso(), perso.getyPerso(), 'P');
                }
            }
        }
    }

    private boolean testBlock(int x, int y) {
        for (PassableBlocks passBlock : PassableBlocks.values()) {
            System.out.println(map.getCase(x, y));
            if (map.getCase(x, y) == passBlock.asChar()) {
                return true;
            }
        }
        return false;
    }
}
