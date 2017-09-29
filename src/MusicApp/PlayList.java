package MusicApp;

import java.io.Serializable;
import java.util.ArrayList;

public class PlayList implements Serializable {

    public static final	long serialVersionUID=42L;
    private ArrayList<Music> list;
    public PlayList(){
        list = new ArrayList<Music>();
    }
    public void add(Music M){
        list.add(M);
    }
    public void delete(String name){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getName().equals(name)) {
                list.remove(i);
                System.out.println("Deleted: current size:"+list.size());
                return;
            }
        }
        System.out.println("No Music Found");

    }
    public String show(){
        String s ="";
        if(list.size()==0)
            return "No songs exits";
        for(int i = 0;i<list.size();i++){
            s+=list.get(i)+"\n";
        }
        return s;
    }
    public String search(String name){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getName().equals(name)) {
                return (list.get(i).toString());
            }
        }
        return  ("No Music Found");
    }

    public ArrayList<Music> getList() {
        return list;
    }
}
