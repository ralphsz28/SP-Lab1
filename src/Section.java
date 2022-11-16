import java.util.ArrayList;

public class Section implements Element {
	String title;
	public ArrayList<Element> content = new ArrayList<Element>();
	
	public Section(String title) {
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println(this.title);
		for(int i=0;i<content.size();i++) {
			content.get(i).print();
		}
	}
	
	public void add(Element element) {
		content.add(element);
	}
	
	public void remove(Element element) {
		content.remove(element);
	}
	
	public Element get(int i) {
		return content.get(i);
	}

}
