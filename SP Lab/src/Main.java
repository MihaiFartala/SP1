public class Main {
    public static void main(String[] args) throws Exception {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);
        Section cap0 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.add(new Paragraph("Multumesc celor care ..."));
        noapteBuna.add(cap0);
        cap0.add(new Paragraph("Moto capitol"));
        cap0.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));

        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));

        ToC_Visitor v = new ToC_Visitor();
        noapteBuna.accept(v);
        noapteBuna.add(v.getToC());

        noapteBuna.print();

    }
}