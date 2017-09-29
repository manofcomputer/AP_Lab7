package MusicApp;

import java.io.File;
import java.io.Serializable;


public class Music implements Serializable{
    public static final	long serialVersionUID=40L;

    private String name,singer,duration;

    public String getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }
    public Music(String name,String singer,String duration){
        this.singer=singer;
        this.name=name;
        this.duration=duration;
    }

    @Override
    public String toString() {
        return name+" "+singer+" "+duration;
    }
}
