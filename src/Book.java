import java.util.ArrayList;

public class Book{
	
	public ArrayList<Author> authors = new ArrayList<Author>();
	public TableOfContents tableOfContents = new TableOfContents();
	public ArrayList<Element> content = new ArrayList<Element>();
	public String name;
	public Author author;
	
	public Book (String name) {
		this.name=name;
	}
	public void addAuthor (Author author) {
		authors.add(author); 
	}
	public void addContent(Element element) {
		content.add(element);
	}
	public void print() {
		System.out.println("Book: " + name);
		System.out.println("Authors:");
		for(int i=0;i<authors.size();i++) {
			System.out.println("Author: " + authors.get(i).name);
		}
		for(int i=0;i<content.size();i++) {
			content.get(i).print();
		}
	}
}
