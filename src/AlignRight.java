
public class AlignRight implements AlignStrategy {

	@Override
	public void Render(Paragraph paragraph) {
		System.out.println("Paragraph: " + paragraph.getText() + " ##");
	}

}
