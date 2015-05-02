import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List extends JFrame
{
	private JList list;
	private static String[] c =
		{ "black", "blue", "red", "white" };
	private static Color[] c2 =
		{ Color.BLACK, Color.BLUE, Color.RED, Color.WHITE };

	public List()
	{
		super("JList");
		setLayout(new FlowLayout());

		list = new JList(c);
		list.setVisibleRowCount(c.length);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));

		list.addListSelectionListener(new ListSelectionListener()
		{
			@Override
			public void valueChanged(ListSelectionEvent event)
			{
				getContentPane().setBackground(c2[list.getSelectedIndex()]);
			}
		});
	}
}
