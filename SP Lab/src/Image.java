public class Image implements Element{
    String imageName;

    public Image(String image) {
        this.imageName = image;
    }

    public void  print(){
        System.out.println("Paragraph: " + imageName);
    }

}