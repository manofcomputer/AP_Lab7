package MusicApp;


import java.io.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        File folder = new File(".");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            }
        }
        boolean choice = true;
        Scanner reader = new Scanner(System.in);
        /*Music m1 = new Music("ABC","BOBBY","10");
        Music m2 = new Music("fireflies","xefjifew","10:37");
        Music m3 = new Music("wed","imagine dragons","10:37");
        PlayList ll = new PlayList();
        ll.add(m1);
        ll.add(m2);
        ll.add(m3);
        serialize(ll,"x.music");*/
        while(choice){
            System.out.println("Enter name of playList");
            String filename= reader.nextLine();
            PlayList list = deserialize(filename);
            System.out.println("Enter options:\n a.Add \n b.Delete \n c.Search \n d.Show \n e.Back to Menu\n f.Exit");
            String option = reader.nextLine();
            if(option.equals("f")) {
                serialize(list,filename);
                return;
            }
            boolean choice1 =true;
            while(choice1){
                if(option.equals("a")){
                    Music M= new Music(reader.nextLine(),reader.nextLine(),reader.nextLine());
                    list.add(M);
                }
                else if(option.equals("b"))
                    list.delete(reader.nextLine());
                else if(option.equals("c")){
                    System.out.println(list.search(reader.nextLine()));
                }
                else if(option.equals("d")){
                    System.out.println(list.show());
                }
                else if(option.equals("e")){
                    choice1=false;
                    serialize(list,filename);
                    break;
                }
                else{
                    serialize(list,filename);
                    return;
                }
                System.out.println("Enter options:\n a.Add \n b.Delete \n c.Search \n d.Show \n e.Back to Menu\n f.Exit");
                option = reader.nextLine();

            }
        }

    }
    public static void serialize(PlayList list,String filename) throws IOException{
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(list);
        }
        finally {
            out.close();
        }
    }
    public static PlayList deserialize(String filename) throws IOException,ClassNotFoundException{
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(filename
            ));
            return (PlayList) in.readObject();
        }
        finally {
            in.close();
        }
    }
}