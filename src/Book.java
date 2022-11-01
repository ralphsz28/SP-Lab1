import java.util.ArrayList;

public class Book{
	
	//public ArrayList<String> content = new ArrayList<String>();
	public TableOfContents tableOfContents = new TableOfContents();
	public String name;
	public Author author;
	
	public Book (String name) {
		this.name=name;
		this.author=author;
	}
	
	public void addAuthor (Author author) {
		this.author=author; 
	}
	
	public int createChapter(String chapter) {
		Chapter c = new Chapter(chapter);
		tableOfContents.append(c);
		return tableOfContents.content.size()-1;
	}
	
	public Chapter getChapter (int i) {
		return tableOfContents.content.get(i);
	}
	
	public void print() {
		for(int i=0;i<tableOfContents.content.size();i++) {
			System.out.println(tableOfContents.content.get(i));
		}
	}
}
