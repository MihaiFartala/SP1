
public class MediaSizeVisitor implements Visitor{
    MediaSize ms = new MediaSize();

    @Override
    public void songVisited(Melodie m) {
        ms.MelodiiSize(m.kb);
    }

    @Override
    public void playlistVisited(Playlist p) {
    }

    @Override
    public void videoVisited(Video v) {
        ms.VideosSize(v.kb);
    }

    @Override
    public void gifVisited(Gif g) {
        ms.GifsSize(g.kb);
    }

    @Override
    public void printSizes() {
        ms.print();
    }
}
