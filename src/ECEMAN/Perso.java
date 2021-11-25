package ECEMAN;

public class Perso {

    private int xPerso;
    private int yPerso;

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
}
