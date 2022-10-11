import java.util.ArrayList;
import java.util.*;

public class Book {
    String title;
    String paragraph;
    String image;
    String table;

    List<String> BookContents = new ArrayList<String>();

    public Book(String title) {
        this.title = title;
        BookContents.add(title);
    }

    public String getParagraph() {
        return paragraph;
    }

    public String getImage() {
        return image;
    }

    public String getTable() {
        return table;
    }

    public void createNewParagraph(String paragraph) {
        this.paragraph = paragraph;
        BookContents.add(paragraph);
    }

    public void createNewImage(String image) {
        this.image = image;
        BookContents.add(image);
    }

    public void createNewTable(String table) {
        this.table = table;
        BookContents.add(table);
    }


    @Override
    public String toString()
    {
       return this.BookContents.toString();
    }
}