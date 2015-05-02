import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI5 extends JFrame
{
	private static final long serialVersionUID = -1317943784143690203L;
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;

	public GUI5()
	{
		super("JRadioButton");
		setLayout(new FlowLayout());

		tf = new JTextField("Enter", 25);
		add(tf);

		pb = new JRadioButton("Plain");
		add(pb);

		bb = new JRadioButton("Bold");
		add(bb);

		ib = new JRadioButton("Italic");
		add(ib);

		bib = new JRadioButton("Bold and Italic");
		add(bib);

		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);

		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);

		// wait for the event to happen, pass in font object to constructor
		pb.addItemListener(new Handler(pf));
		bb.addItemListener(new Handler(bf));
		ib.addItemListener(new Handler(itf));
		bib.addItemListener(new Handler(bif));
	}

	private class Handler implements ItemListener
	{
		private Font font;
		
		public Handler(Font f)
		{
			font = f;
		}

		@Override
		public void itemStateChanged(ItemEvent event)
		{
			tf.setFont(font);
		}
	}
}
