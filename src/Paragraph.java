
public class Paragraph implements Element {
	
	String text;
	AlignStrategy align;
	
	public Paragraph(String text) {
		this.text = text;
	}

	@Override
	public void print() {
		if (align != null) {
			align.Render(this);
		}else {
			System.out.println("Paragraph: " + text);
		}
	}
	
	public String getText() {
		return text;
	}
	
	public void setAlignStrategy(AlignStrategy alignMode) {
		this.align=alignMode;
		
	}

}
