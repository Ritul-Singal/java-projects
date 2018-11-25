import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ScrollBAR extends JFrame implements AdjustmentListener{
	int a1,a2,a3;
	JScrollBar sb1,sb2,sb3;
	JTextField t1;
	Color c1;
	public ScrollBAR() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(4,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1=new JTextField(20);
		sb1=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,226);
		sb1.addAdjustmentListener(this);
		sb2=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,226);
		sb2.addAdjustmentListener(this);
		sb3=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,226);
		sb3.addAdjustmentListener(this);
		sb1.setPreferredSize(new Dimension (200,25));
		sb2.setPreferredSize(new Dimension (200,25));
		sb3.setPreferredSize(new Dimension (200,25));
		c1=new Color(a1,a2,a3);
		t1.setBackground(c1);
		add(t1);add(sb1);add(sb2);add(sb3);
		//pack();
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ScrollBAR();
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		
		a1=sb1.getValue();
		a2=sb2.getValue();
		a3=sb3.getValue();
	}

}
