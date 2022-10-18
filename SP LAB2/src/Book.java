import java.util.ArrayList;
import java.util.List;
public class Book {
    String title;
    String Author;
    List<Chapter> Chapters = new ArrayList<Chapter>();

    public void addAuthor(String author) { Author = author; }

    public int createChapter(String chapter) {
        Chapter Capitol = new Chapter(chapter);
        Chapters.add(Capitol);
        for(int i=0;i<Chapters.size();i++){
            if(Capitol == Chapters.get(i))
            {
                return i;
            }
        }
        return 0;
    }

    public Chapter getChapter(int i){
       return Chapters.get(i);
    }

    public Book(String title) {
        this.title = title;
    }

}
