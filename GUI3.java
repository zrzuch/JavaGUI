import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI3 extends JFrame {

	private static final long serialVersionUID = -7704058971889585843L;
	private JButton reg;
	private JButton reg2;
	private JButton reg3;
	private JButton reg4;
	private JButton reg5;
	private JButton reg6;
	private JButton reg7;

	// private JButton custom;

	public GUI3() {

		super("Button Example");
		setLayout(new FlowLayout());

		reg = new JButton("JCheckBox");
		add(reg);

		reg2 = new JButton("JTextField");
		add(reg2);

		reg3 = new JButton("Hover Example");
		add(reg3);

		reg4 = new JButton("Addition Example");
		add(reg4);

		reg5 = new JButton("JRadioButton");
		add(reg5);

		reg6 = new JButton("JComboBox");
		add(reg6);

		reg7 = new JButton("JList");
		add(reg7);
		/*
		 * Icon a = new ImageIcon(getClass().getResource("a.png")); Icon b = new
		 * ImageIcon(getClass().getResource("b.png"));
		 * 
		 * custom = new JButton("Custom", a); custom.setRolloverIcon(b);
		 * add(custom);
		 */
		Handler hand = new Handler();
		reg.addActionListener(hand);
		reg2.addActionListener(hand);
		reg3.addActionListener(hand);
		reg4.addActionListener(hand);
		reg5.addActionListener(hand);
		reg6.addActionListener(hand);
		reg7.addActionListener(hand);
		// custom.addActionListener(hand);
	}

	private class Handler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == reg) {
				GUI4 gui = new GUI4();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.setSize(250, 100);
				gui.setVisible(true);
			} else if (event.getSource() == reg2) {
				GUI2 gui = new GUI2();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.setSize(300, 300);
				gui.setVisible(true);
			} else if (event.getSource() == reg3) {
				GWJ gui = new GWJ();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.setSize(275, 180);
				gui.setVisible(true);
			} else if (event.getSource() == reg4) {
				// It is used by the constructor
				@SuppressWarnings("unused")
				AddGUI gui = new AddGUI();
			} else if (event.getSource() == reg5) {
				GUI5 gui = new GUI5();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.setSize(300, 200);
				gui.setVisible(true);
			} else if (event.getSource() == reg6) {
				ComboBox gui = new ComboBox();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.setSize(300, 200);
				gui.setVisible(true);
			} else if (event.getSource() == reg7) {
				List gui = new List();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.setSize(300, 200);
				gui.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null,
						String.format("%s", event.getActionCommand()));
			}
		}
	}
}
