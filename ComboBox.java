import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox extends JFrame
{
	private static final long serialVersionUID = -6514082728788859243L;
	private JComboBox box;
	private JLabel pic;
	private static final String[] fileName = { "a.png", "b.png" };
	private Icon[] pics = { new ImageIcon(getClass().getResource(fileName[0])),
			new ImageIcon(getClass().getResource(fileName[1])) };

	public ComboBox()
	{
		super("ComboBox");
		setLayout(new FlowLayout());

		box = new JComboBox(fileName);
		box.addItemListener(new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent event)
			{
				if (event.getStateChange() == ItemEvent.SELECTED)
				{
					pic.setIcon(pics[box.getSelectedIndex()]);
				}
			}
		});
		add(box);
		pic = new JLabel(pics[0]);
		add(pic);
	}
}
