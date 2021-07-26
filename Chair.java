import java.util.*;
public class Chair extends Furniture {

    private boolean occupied;
    private double comfortRating;

    public Chair(int x, int y, double comfort) {
        super(x, y);
        if(comfort>100) comfortRating = 100.0;
        else if(comfort<0) comfortRating = 0.0;
        else comfortRating = comfort;
        occupied = false;
    }

    public String display(){
        return "A chair with comfort rating " + comfortRating;
    }

    public double getComfortRating(){
        return comfortRating;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public void occupy(Ornament o){
        if(o==null) return;
        if(o.getValution()>=100) 
            occupied = true;
    }
}
