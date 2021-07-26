import java.util.*;
import java.text.*;
public class Table extends Furniture implements Iterable<Chair> {

    private Set<Chair> chairSet;
    private String tableclothColour;

    public Table(int x, int y, String colour, int chair) {
        super(x, y);
        tableclothColour = colour;
        chairSet = new LinkedHashSet<Chair>();
        for(int i = 0; i<chair; i++){
            String chairStr = tableclothColour + Integer.toString(i);
            Chair c = new Chair(x, y, Math.abs(chairStr.hashCode())%101);
            chairSet.add(c);
        }
    }

    public String display(){
        String s;
        if(tableclothColour == null){
            s = "A table with no tablecloth";
            if(chairSet.size()>0) s += "\n";
            int i = 0;
            for(Chair it :this) {
                if(i==chairSet.size()-1) {
                    s += " - A chair with comfort rating 0.0";
                    break;
                }
                s += " - A chair with comfort rating 0.0\n";
                i++;
            }
            return s;
        }
        s = "A table with a "+ tableclothColour +" tablecloth";
        //Iterator<Chair> it = chairSet.iterator();
        if(chairSet.size()>0) s += "\n";
        int i = 0;
        List<Chair> chairList = new ArrayList<>(chairSet);
        Collections.sort(chairList, Comparator.comparing(Chair::getComfortRating).reversed());
        for(Chair it :chairList) {
            if(i==chairSet.size()-1) {
                s += " - "+it.display();
                break;
            }
            s += " - "+it.display()+"\n";
            i++;
        }
        return s;
    }

    public int getChairSet(){
        return chairSet.size();
    }

    public Iterator<Chair> iterator(){
        // List<Chair> chairList = new ArrayList<>(chairSet);
        // Collections.sort(chairList, Comparator.comparing(Chair::getComfortRating).reversed());
        //Set<Chair> chairL = new HashSet<>(chairList);
        return chairSet.iterator();
    }
}
