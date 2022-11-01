import java.util.ArrayList;

public class Book{
	
	public ArrayList<String> content = new ArrayList<String>();
	public TableOfContents continut = new TableOfContents();
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
		continut.append(c);
		return continut.content.size()-1;
	}
	
	public Chapter getChapter (int i) {
		return continut.content.get(i);
	}
	
	public void createNewParagraph(String paragraph) {
		content.add("Paragraph: " + paragraph);
	}
	
	public void createNewImage(String image) {
		content.add("Paragraph: " + image);
	}
	
	public void createNewTable(String table) {
		content.add("Table: " + table);
	}
	
	public void print() {
		for(int i=0;i<content.size();i++) {
			System.out.println(content.get(i));
		}
	}
}
