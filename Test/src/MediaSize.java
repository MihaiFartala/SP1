public class MediaSize implements File{
    int DimMelodii = 0;
    int DimVideos = 0;
    int DimGifs = 0;
    int DimTotala = 0;


    public void MelodiiSize(int songSize)
    {
        DimMelodii = DimMelodii + songSize;
        DimTotala = DimTotala + songSize;
    }

    public void VideosSize(int videoSize)
    {
        DimVideos = DimVideos + videoSize;
        DimTotala = DimTotala + videoSize;
    }

    public void GifsSize(int GifSize)
    {
        DimGifs = DimGifs + GifSize;
        DimTotala = DimTotala + GifSize;
    }
    @Override
    public void add(File f) {

    }

    @Override
    public void print() {
        System.out.println("Dim Melodii: " + DimMelodii + "kb");
        System.out.println("Dim Videos: " + DimVideos + "kb");
        System.out.println("Dim Gifs: " + DimGifs + "kb");
        System.out.println("Dim Totala: " + DimTotala + "kb");
    }

    @Override
    public void accept(Visitor v) {

    }
}
