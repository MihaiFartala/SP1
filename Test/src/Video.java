public class Video implements File{
    String title;
    int kb;

    public Video(String title, int kb) {
        this.title = title;
        this.kb = kb;
    }

    @Override
    public void add(File e) {

    }

    @Override
    public void print() {
        System.out.println("Video: " + this.title + ", Dim: " + this.kb);
    }

    @Override
    public void accept(Visitor v) {
        v.videoVisited(this);
    }
}
