package Replts.calc_II_Encapsulation;

public class Calc {

    private int x,y,results;

    public Calc(){
        this.x = x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }

    public int getResults() {
        return results;
    }

    public void plus(){
        results = x + y;
    }

    public void minus(){
         results = x - y;
    }

}
