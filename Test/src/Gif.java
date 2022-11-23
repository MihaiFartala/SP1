public class Gif implements File{
    String title;
    int kb;

    public Gif(String title, int kb) {
        this.title = title;
        this.kb = kb;
    }

    @Override
    public void add(File e) {

    }

    @Override
    public void print() {
        System.out.println("Gi2f: " + this.title  + ", Dim: " + this.kb);
    }

    @Override
    public void accept(Visitor v) {
        v.gifVisited(this);
    }
}
