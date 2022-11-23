public class Melodie implements File{
    String title;
    int kb;

    public Melodie(String title, int kb) {
        this.title = title;
        this.kb = kb;
    }

    @Override
    public void add(File e) {

    }

    @Override
    public void print() {
        System.out.println("Melodie: " + this.title + ", Dim: " + this.kb);
    }

    @Override
    public void accept(Visitor v) {
        v.songVisited(this);
    }
}
