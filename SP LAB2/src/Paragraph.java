public class Paragraph implements Element{
    String text;

    public Paragraph(String paragraph) {
        this.text = paragraph;
    }

    public void  print(){
        System.out.println("Paragraph: " + text);
    }

}
