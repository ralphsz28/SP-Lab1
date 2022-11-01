import java.util.ArrayList;

public class SubChapter {
	
	String name;
	public ArrayList<Element> content = new ArrayList<Element>();
	
	public SubChapter (String name) {
		this.name=name;
	}
	
	public void createNewParagraph(String text) {
		Paragraph paragraph = new Paragraph(text);
		content.add(paragraph);
	}
	public void createNewImage(String imageName) {
		Image image = new Image(imageName);
		content.add(image);
	}
	public void createNewTable(String title) {
		Table table = new Table(title);
		content.add(table);
	}
	
	public void print() {
		for (int i=0 ;i<content.size();i++) {
			content.get(i).print();
		}
	}
}