package ECEMAN;

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

        switch (direction) {
            case 'z':
                if (testBlock(perso.getxPerso()-1, perso.getyPerso()))
                    perso.setyPerso(perso.getxPerso() - 1);
                break;
            case 's':
                if (testBlock(perso.getxPerso()+1, perso.getyPerso()))
                    perso.setyPerso(perso.getxPerso() + 1);
                break;
            case 'q':
                if (testBlock(perso.getxPerso(), perso.getyPerso()-1))
                    perso.setyPerso(perso.getyPerso() - 1);
                break;
            case 'd':
                if (testBlock(perso.getxPerso(), perso.getyPerso()+1)) {
                    perso.setyPerso(perso.getyPerso() + 1);
                    System.out.println("je suis passé");
                }
                break;
        }
        Affichage.afficher(map,perso);
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
