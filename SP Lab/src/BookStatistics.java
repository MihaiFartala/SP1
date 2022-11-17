public class BookStatistics implements Visitor{

    int tablesVisited = 0;
    int imagesVisited = 0;
    int paragraphsVisited = 0;


    @Override
    public void visitBook(Book b) {
    }

    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitParagraph(Paragraph p) {
        paragraphsVisited = paragraphsVisited + 1;
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        imagesVisited = imagesVisited + 1;
    }

    @Override
    public void visitImage(Image im) {
        imagesVisited = imagesVisited + 1;
    }

    @Override
    public void visitTable(Table t) {
        tablesVisited = tablesVisited + 1;
    }


    public void printStatistics(){
        System.out.println("Book Statistics");
        System.out.println("***Number of images: " + imagesVisited);
        System.out.println("***Number of tables: " + tablesVisited);
        System.out.println("***Number of paragraphs: " + paragraphsVisited);
    }
}
