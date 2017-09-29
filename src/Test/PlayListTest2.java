package Test;

import MusicApp.Menu;
import MusicApp.Music;
import MusicApp.PlayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlayListTest2 {
    Music m3 = new Music("killer BOYS","dragons nnnn","0001");
    @Test
    public void add() throws Exception {
        PlayList ll = Menu.deserialize("x.music");
        String xx = ll.show();
        ll.add(m3);
        String yy = ll.show();
        //System.out.println(yy);
        xx = xx +m3.getName()+" "+m3.getSinger()+" "+m3.getDuration()+"\n";
        //System.out.println(xx);
        assertEquals(xx,yy);
    }
    @Test
    public void delete() throws Exception {
        PlayList ll = Menu.deserialize("x.music");
        String xx = ll.show();
        ll.add(m3);
        ll.delete(m3.getName());
        String yy = ll.show();
        //System.out.println(yy);
        //System.out.println(xx);
        assertEquals(xx,yy);

    }

    @Test
    public void search() throws Exception {
        PlayList ll = Menu.deserialize("x.music");
        ll.add(m3);
        String xx = ll.search(m3.getName());
        //System.out.println(yy);
        //System.out.println(xx);
        assertEquals(xx,m3.getName()+" "+m3.getSinger()+" "+m3.getDuration());
    }


}
