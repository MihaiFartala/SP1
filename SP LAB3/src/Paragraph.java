public class Paragraph implements Element{
    String text;

    public Paragraph(String paragraph) {
        this.text = paragraph;
    }

    public void  print(){
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void get(int i) {
        throw new UnsupportedOperationException();
    }

}