import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String SubChapterName;

    Element e = new Element() {
        @Override
        public void print() {
            for (Paragraph p: Paragrafe
                 ) {
                p.print();
            }
            for (Table t: Tabele
            ) {
                t.print();
            }
            for (Image i: Imagini
            ) {
                i.print();
            }
        }
    };
    public SubChapter(String subChapterName) {
        SubChapterName = subChapterName;
    }

    public void createNewParagraph(String paragraph) {
        Paragraph Paragraf = new Paragraph(paragraph);
        e.Paragrafe.add(Paragraf);
    }
    public void createNewTable(String table) {
        Table Tabel = new Table(table);
        e.Tabele.add(Tabel);
    }
    public void createNewImage(String image) {
        Image Imagine = new Image(image);
        e.Imagini.add(Imagine);
    }

    public void  print(){
        System.out.println("Subchapter: " + SubChapterName);
        e.print();
    }
}
