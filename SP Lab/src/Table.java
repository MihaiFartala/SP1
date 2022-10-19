public class Table implements Element{
    String title;

    public Table(String table) {
        this.title = table;
    }

    public void  print(){
        System.out.println("Paragraph: " + title);
    }

}