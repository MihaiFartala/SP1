import java.util.ArrayList;
import java.util.List;

public class MediaPlayer{
    String title;
    int kb;

    List<Playlist> lop = new ArrayList<>();
    public MediaPlayer(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(this.title);

        System.out.println();
        for (File f: lop
        ) {
            f.print();
        }
    }

    public void add(Playlist p){
        lop.add(p);
    }

    public void accept(Visitor v){
        for (File f: lop
        ) {
            f.accept(v);
        }

    }

}
