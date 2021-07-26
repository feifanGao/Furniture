import java.util.*;
import java.lang.StringBuilder;
public class House{
    private List<Furniture> furniture;

    public House(){
        furniture = new ArrayList<Furniture>();
    }

    public String listFurniture(){
        StringBuilder a = new StringBuilder();
        a.append("This house contains:");
        if(furniture.size()>0) a.append("\n");
        int b =0;
        for(int i = 0; i<furniture.size();i++){
            if(b == furniture.size()-1)
                a.append(furniture.get(i).display());
            else
                a.append(furniture.get(i).display()+"\n");
            b++;
        }
        String s = a.toString();
        return s;
    }

    public void insert(Furniture item){
        if (item == null) return;
        furniture.add(item);
    }

    public boolean containsTelevision(){
        for(Furniture f:furniture){
            if(f.display().contains("television")) 
                return true;
        }
        return false;
    }

    public int countChairs(){
        int count = 0;
        for(Furniture f:furniture){
            if(f instanceof Chair){
                count++;
            }else if(f instanceof Table) {
                Table t = (Table) f;
                count+=t.getChairSet();
            }
        }
        return count;
    }
}
