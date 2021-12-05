package ECEMAN;

public class Enemy {

    private int xEnemy;
    private int yEnemy;
    private char currentEnemyCase = 'o';


    public Enemy(int x, int y){
        xEnemy = x;
        yEnemy = y;
    }

    public int getxEnemy() {
        return xEnemy;
    }
    public void setxEnemy(int xEnemy) {
        this.xEnemy = xEnemy;
    }

    public int getyEnemy() {
        return yEnemy;
    }
    public void setyEnemy(int yEnemy) {
        this.yEnemy = yEnemy;
    }

    public int []GetCoords(){
        return new int[]{xEnemy, yEnemy};
    }
    public void setEnemyCoords(int x,int y){
        xEnemy = x;
        yEnemy = y;
    }

    public char getEnemyCurrentCase() {
        return currentEnemyCase;
    }
    public void setEnemyCurrentCase(char currentEnemyCase) {
        this.currentEnemyCase = currentEnemyCase;
    }

}
