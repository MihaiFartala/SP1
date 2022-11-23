public class Main {
    public static void main(String[] args) throws Exception {
        MediaPlayer mp1 = new MediaPlayer("Winamp");
        Playlist p1 = new Playlist("Chill");
        p1.add(new Melodie("BudaBar", 3000));
        p1.add(new Video("Waves in Caraibe", 20000));
        p1.add(new Melodie("Simple things", 4000));
        p1.add(new Gif("Sunglasses", 500));
        mp1.add(p1);


        MediaSizeVisitor v = new MediaSizeVisitor();
        mp1.accept(v);
        v.printSizes();



    }
}