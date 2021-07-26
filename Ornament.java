import java.util.*;
import java.text.DecimalFormat;
public class Ornament extends Furniture {

    protected double valuation;

    public Ornament(int x, int y, double value){
        super(x, y);
        valuation = value;
    }

    public double getValution(){
        return valuation;
    }

    public String display(){
        DecimalFormat df = new DecimalFormat("###,##0.00"); 
        return "An ornament worth $" + df.format(valuation);
    }
}
