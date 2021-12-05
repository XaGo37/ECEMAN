package ECEMAN;

public class Perso {

    private int xPerso;
    private int yPerso;

    private char currentCase = 'o';
    private boolean islight = false;

    public Perso(int x, int y){
        xPerso = x;
        yPerso = y;
    }

    //Getter
    public int getxPerso() {
        return xPerso;
    }
    public void setxPerso(int xPerso) {
        this.xPerso = xPerso;
    }

    //Setter
    public int getyPerso() {
        return yPerso;
    }
    public void setyPerso(int yPerso) {
        this.yPerso = yPerso;
    }

    public int []GetCoords(){
        return new int[]{xPerso, yPerso};
    }
    public void setCoords(int x,int y){
        xPerso = x;
        yPerso = y;
    }


    public char getCurrentCase() {
        return currentCase;
    }
    public void setCurrentCase(char currentCase) {
        this.currentCase = currentCase;
    }

    public boolean isIslight() {
        return islight;
    }
    public void setIslight(boolean islight) {
        this.islight = islight;
    }
}
