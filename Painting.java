import java.util.*;
import java.text.DecimalFormat;   
public class Painting extends Ornament {

    private String painter;
    private int year;

    public Painting(int x, int y, double value, String painter, int year){
        super(x, y, value);
        this.painter = painter;
        this.year = year;
    }

    public String getPainter(){
        return painter;
    }

    public int getYear(){
        return year;
    }

    public String display(){
        DecimalFormat df = new DecimalFormat("###,##0.00");   
        return "A painting by "+painter+" painted in "+year+", worth $" + df.format(getValution());
    }
}


    

