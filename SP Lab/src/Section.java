import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    String title;
    List<Element> ListofContent = new ArrayList<>();
    public Section(String title) {
        this.title = title;
    }

    public void add(Element e) {
        ListofContent.add(e);
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void get(int i) {
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
        for (Element e: ListofContent
             ) {
            e.accept(v);
        }
    }


    public void print() {
        System.out.println(title);

        for (Element e:ListofContent
        ) {
            e.print();
        }
    }
}