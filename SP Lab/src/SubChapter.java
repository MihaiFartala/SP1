import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String SubChapterName;
    List<Element> AllHere = new ArrayList();
    public SubChapter(String subChapterName) {
        SubChapterName = subChapterName;
    }

    public void createNewParagraph(String paragraph) {
        Paragraph Paragraf = new Paragraph(paragraph);
        AllHere.add(Paragraf);
    }
    public void createNewTable(String table) {
        Table Tabel = new Table(table);
        AllHere.add(Tabel);
    }
    public void createNewImage(String image) {
        Image Imagine = new Image(image);
        AllHere.add(Imagine);
    }

    public void  print(){
        System.out.println("Subchapter: " + SubChapterName);

        for(Element z: AllHere){
            z.print();
        }
    }
}