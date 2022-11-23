import java.util.ArrayList;
import java.util.List;

public class Playlist implements File{

    String title;
    int kb;

    List<File> ListofContent = new ArrayList<>();

    @Override
    public void add(File f) {
        ListofContent.add(f);
    }


    public Playlist(String title) {
        this.title = title;
    }


    @Override
    public void print() {
        System.out.println("Playlist: " + this.title);

        for (File f:ListofContent
        ) {
            f.print();
        }
    }

    @Override
    public void accept(Visitor v) {
        v.playlistVisited(this);
        for (File f: ListofContent
        ) {
            f.accept(v);
        }
    }
}
