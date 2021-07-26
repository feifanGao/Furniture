import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class HouseTest{
    // @Test
	// public void testIteratorTable(){
    //     House h = new House();
    //     Table t = new Table(1,2,"red",3);
    //     h.insert(t);
    //     String s;
    //     //Iterator<Chair> it = t.iterator();
    //     while(Chair c:t){
    //         s+=c.display();
    //     }
    //     String str = 
    //     assertEquals(str,s);

    // }
	@Test
	public void testList(){
        House h = new House();
        Table t = new Table(1,2,"Blue",2);
        h.insert(t);

        Television te = new Television(2,5,144,280);
        h.insert(te);

        Chair c1 = new Chair(6,8,110);
        Chair c2 = new Chair(6,8,36);
        h.insert(c1);
        h.insert(c2);

        Ornament o1 = new Ornament(6,8,3900.515);
        Ornament o2 = new Ornament(6,8,98);
        h.insert(o1);
        h.insert(o2);

        Painting p1 = new Painting(5,34,900.543,"Felix G",2021);
        h.insert(p1);

        String s = "This house contains:\nA table with a Blue tablecloth\n - A chair with comfort rating 42.0\n - A chair with comfort rating 41.0\nA 144x280 television in the off state.\nA chair with comfort rating 100.0\nA chair with comfort rating 36.0\nAn ornament worth $3,900.51\nAn ornament worth $98.00\nA painting by Felix G painted in 2021, worth $900.54";
        assertEquals(h.listFurniture(),s);
    }
}
