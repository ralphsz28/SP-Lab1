import java.util.ArrayList;

public class TableOfContents {
	
	public ArrayList<Chapter> content = new ArrayList<Chapter>();
	
	public TableOfContents () {
		this.content=content;
	}
	
	public void append(Chapter chapter) {
		this.content.add(chapter);
	}
	
}
