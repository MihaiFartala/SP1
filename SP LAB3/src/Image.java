public class Image implements Element{
    String imageName;

    public Image(String image) {
        this.imageName = image;
    }

    public void  print(){
        System.out.println("Image with name: " + imageName);
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