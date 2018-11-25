import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import components.swapButton;
public class swing_swap extends JFrame implements ActionListener{
	JTextField t1,t2;
	JButton b1;
	swing_swap(){
		setLayout(new GridLayout(3,1));
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("swap");
		b1.addActionListener(this);
		add(b1);add(t1);add(t2);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		//setSize(400,300);
		//pack();
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new swing_swap();

	}
	public void actionPerformed(ActionEvent ae) {
		String s=t1.getText();
		t1.setText(t2.getText());
		t2.setText(s);
	}

}
