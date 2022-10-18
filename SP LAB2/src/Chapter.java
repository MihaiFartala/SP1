import java.util.ArrayList;
import java.util.List;

public class Chapter {
   String ChapterName;
   List<SubChapter> SubChapters = new ArrayList<SubChapter>();
    public Chapter(String chapterName) {
        ChapterName = chapterName;
    }

    public int createSubChapter(String subchapter) {
        SubChapter SubCapitol = new SubChapter(subchapter);
        SubChapters.add(SubCapitol);
        for(int i=0;i<SubChapters.size();i++){
            if(SubCapitol == SubChapters.get(i))
            {
                return i;
            }
        }
        return 0;
    }
    public SubChapter getSubChapter(int i){
        return SubChapters.get(i);
    }
    public void  print(){
        System.out.println("Chapter: " + ChapterName);
    }
}
