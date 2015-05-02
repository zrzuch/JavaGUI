import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class GUI2 extends JFrame
{

	private static final long serialVersionUID = 8946946850066513104L;
	private JTextField item;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField pass;

	public GUI2()
	{
		super("Field Example");
		setLayout(new FlowLayout());

		item = new JTextField(10);
		add(item);

		item2 = new JTextField("Enter Text Here");
		add(item2);

		item3 = new JTextField("Uneditable", 10);
		add(item3);

		pass = new JPasswordField("mypass");
		add(pass);

		TheHandler hand = new TheHandler();
		item.addActionListener(hand);
		item2.addActionListener(hand);
		item3.addActionListener(hand);
		pass.addActionListener(hand);
	}

	private class TheHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String s = "";
			if (event.getSource() == item)
			{
				s = String.format("Field 1: %s", event.getActionCommand());
			} else if (event.getSource() == item2)
			{
				s = String.format("Field 2: %s", event.getActionCommand());
			} else if (event.getSource() == item3)
			{
				s = String.format("Field 3: %s", event.getActionCommand());
			} else if (event.getSource() == pass)
			{
				s = String.format("Password Field: %s",
						event.getActionCommand());
			}
			JOptionPane.showMessageDialog(null, s);
		}
	}
}
