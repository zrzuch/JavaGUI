import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GWJ extends JFrame
{

	private static final long serialVersionUID = 2570509082917193705L;
	private final JLabel item;

	public GWJ()
	{
		super("Hover Example");
		setLayout(new FlowLayout());
		
		item = new JLabel("This is a sentence.");
		item.setToolTipText("This is gonna show up on hover.");
		add(item);
	}
}
