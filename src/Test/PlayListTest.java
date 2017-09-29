package Test;

import org.junit.*;
import MusicApp.*;

import static org.junit.Assert.assertEquals;

public class PlayListTest {
    @Test
    public void add() throws Exception {
        PlayList ll = Menu.deserialize("x.music");
        String xx = ll.show();
        Music m3 = new Music("radioactive","imagine dragons","10:37");
        ll.add(m3);
        String yy = ll.show();
        //System.out.println(yy);
        xx = xx +"radioactive imagine dragons 10:37\n";
        //System.out.println(xx);
        assertEquals(xx,yy);
    }

    @Test
    public void delete() throws Exception {
        PlayList ll = Menu.deserialize("x.music");
        String xx = ll.show();
        Music m3 = new Music("radioactive","imagine dragons","10:37");
        ll.add(m3);
        ll.delete("radioactive");
        String yy = ll.show();
        //System.out.println(yy);
        //System.out.println(xx);
        assertEquals(xx,yy);

    }

    @Test
    public void search() throws Exception {
        PlayList ll = Menu.deserialize("x.music");
        Music m3 = new Music("radioactive","imagine dragons","10:37");
        ll.add(m3);
        String xx = ll.search("radioactive");
        //System.out.println(yy);
        //System.out.println(xx);
        assertEquals(xx,"radioactive imagine dragons 10:37");
    }

}