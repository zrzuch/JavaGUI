/*
 * This program uses check boxes and an ItemListener
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI4 extends JFrame
{
	private static final long serialVersionUID = -2629911859230340750L;
	private JTextField tf;
	private JCheckBox bold;
	private JCheckBox italic;

	public GUI4()
	{
		super("Check Box");
		setLayout(new FlowLayout());

		tf = new JTextField("Sentence", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);

		bold = new JCheckBox("Bold");
		add(bold);

		italic = new JCheckBox("Italic");
		add(italic);

		Handler hand = new Handler();
		bold.addItemListener(hand);
		italic.addItemListener(hand);
	}

	private class Handler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			Font f = null;
			if (bold.isSelected() && italic.isSelected())
			{
				f = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if (bold.isSelected())
			{
				f = new Font("Serif", Font.BOLD, 14);
			}
			else if (italic.isSelected())
			{
				f = new Font("Serif", Font.ITALIC, 14);
			}
			else
			{
				f = new Font("Serif", Font.PLAIN, 14);
			}
			tf.setFont(f);
		}
	}
}
