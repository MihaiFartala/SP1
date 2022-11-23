public interface File {

    public void add(File f);
    public void print();
    public void accept(Visitor v);
}
