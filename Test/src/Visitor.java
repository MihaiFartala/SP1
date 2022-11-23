public interface Visitor {

    public void songVisited(Melodie m);
    public void playlistVisited(Playlist p);
    public void videoVisited(Video v);
    public void gifVisited(Gif g);
    public void printSizes();
}
