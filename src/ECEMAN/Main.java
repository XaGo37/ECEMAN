package ECEMAN;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    private static char[][] mapLVL1 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'P', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'E', 'o', 'o', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};


    private static char[][] mapLVL2 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'P', 'o', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'o', 'o', 'E', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};


    private static char[][] mapLVL3 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'E', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'o', 'o', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', 'M', 'o', 'o', 'M', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'o', 'o', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'P', 'o', 'o', 'o', 'o', 'o', 'o', 'L', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'M'},
            {'M', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

    private static char[][] mapLVL4 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'T', 'o', 'o', 'o', 'o', 'o', 'E', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'P', 'o', 'T', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'X', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

    private static char[][] mapLVL5 = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'E', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'o', 'o', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', 'M', 'o', 'o', 'M', '#', '#', '#', '#', '#', '#', '#'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'o', 'o', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'P', 'o', 'o', 'o', 'o', 'o', 'o', 'L', 'o', '<', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'M'},
            {'M', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};


    private static Perso player = new Perso(0, 0);
    private static Map map = new Map(mapLVL4);
    private static Level lvl1 = new Level(map, player);
    private static int lvlnumber = 1;

    public static void main(String[] args) throws IOException {


        int userSelected;
        do {
            userSelected = MenuData();
            switch (userSelected) {
                case 1:
                    System.out.println("Voici les règles du jeu :");
                    System.out.println("##########################");

                    break;
                case 2:
                    playGame();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("QUITTER");
                    System.exit(0);
                    break;
            }
        }
        while (userSelected > 4);


    }

    public static int MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez une option :");
        System.out.println(" 1 - Regles du jeu ");
        System.out.println(" 2 - Jouer ");
        System.out.println(" 3 - Recharger une partie");
        System.out.println(" 4 - Quitter ");

        System.out.println("Vous avez choisis de :");
        selection = sc.nextInt();
        return selection;
    }

    public static void playGame() throws IOException {
        Map mapLvl1 = new Map(mapLVL1);
        Map mapLvl2 = new Map(mapLVL2);
        Map mapLvl3 = new Map(mapLVL3);
        Map mapLvl4 = new Map(mapLVL4);


        boolean levelFinish = false;

        while (lvlnumber <= 4 && levelFinish == false) {

            System.out.println("Enter choice :");
            char choice= (char) System.in.read();

            if(choice=='5'){
                saveToTextFile();
                System.out.println("LE JEU A ETE SAUVEGARDE");
                System.exit(0);
            }

            switch(lvlnumber){
                case 1:
                    System.out.println("LEVEL 1 ");
                    PlayLevel(player,mapLvl1,choice);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
                case 2:
                    System.out.println("LEVEL 2 ");
                    PlayLevel(player,mapLvl2,choice);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
                case 3:
                    System.out.println("LEVEL 3 ");
                    PlayLevel(player,mapLvl3,choice);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
                case 4:
                    System.out.println("LEVEL 4");
                    PlayLevel(player,mapLvl4,choice);
                    System.out.println("-------------------------------- 5 - QUITTER & SAUVEGARDER");

                    break;
            }
            if (player.getCurrentCase() == ' ') {
                System.out.println("LOOSER");
                System.exit(0);
                levelFinish = true;
            }

        }
    }

    private static void PlayLevel(Perso player, Map map, char choice) {
        Level lvl1 = new Level(map, player);

        lvl1.movePerso(choice);
        if (player.getCurrentCase() == 'E') {
            player.setCurrentCase('P');
            lvlnumber++;
        }
    }


    public static void saveToTextFile() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/TextFile/MAP.txt")));

            int num = 1;

            for (int i = 0; i < mapLVL1.length; i++) {
                for (int j = 0; j < mapLVL1[i].length; j++) {
                    writer.write(mapLVL1[i][j] + " ");
                    num++;
                }

                writer.newLine();
            }
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void readTextFile(){

    }

    }

