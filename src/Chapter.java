import java.util.ArrayList;

public class Chapter {
	
	String name;
	public ArrayList<SubChapter> content = new ArrayList<SubChapter>();
	
	public Chapter (String name) {
		this.name=name;
	}
	
	public int createSubChapter(String subChapterName) {
		SubChapter subChapter = new SubChapter(subChapterName);
		content.add(subChapter);
		return content.size()-1;
	}
	
	public SubChapter getSubChapter (int i) {
		return content.get(i);
	}


}
