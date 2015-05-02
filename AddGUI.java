import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AddGUI extends JFrame
{
	private static final long serialVersionUID = -196489851225527999L;
	private JButton reg;
	
	public AddGUI()
	{
		String fn;
		String sn;
		
		reg = new JButton("Cancel");
		add(reg);
		
		do
		{
			fn = JOptionPane
					.showInputDialog("Enter First Number or Enter \"n\" to Exit: ");
			sn = JOptionPane
					.showInputDialog("Enter Second Number or Enter \"n\" to Exit: ");
			if (fn.equals("N") || fn.equals("n") || sn.equals("N") || sn.equals("n"))
			{
				System.exit(0);
			}
		} 
		while (!(isInteger(fn) || isInteger(sn)));
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;

		JOptionPane.showMessageDialog(null, "The answer is " + sum,
				"the title", JOptionPane.PLAIN_MESSAGE);
	}

	private static boolean isInteger(String s)
	{
		try
		{
			Integer.parseInt(s);
		} 
		catch (NumberFormatException e)
		{
			return false;
		}
		return true;
	}
	@SuppressWarnings("unused")
	private class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == reg) 
			{
				System.exit(0);
			}
		}
	}
}
