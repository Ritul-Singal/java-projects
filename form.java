import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class form extends JFrame implements ItemListener{
	JTextField t1,t2,t3;
	JRadioButton r1,r2;
	JCheckBox c1,c2,c3,c4;
	JLabel l1,l2,l3,l4;
	ButtonGroup bg;
	public form() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(6,2));
		c1=new JCheckBox("c");
		c2=new JCheckBox("c++");
		c3=new JCheckBox("Java");
		c4=new JCheckBox("Adv. Java");
		r1=new JRadioButton("cash");
		r2=new JRadioButton("cheque");
		bg= new ButtonGroup();
		bg.add(r1);bg.add(r2);
		t1=new JTextField("0");
		t2=new JTextField();
		l1=new JLabel("cources:");
		l2=new JLabel(" ");
		l3=new JLabel("Amount");
		l4=new JLabel("Cheque no");
		t1.setEnabled(false);
		t2.setEditable(false);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		r1.addItemListener(this);
		r2.addItemListener(this);
		add(l1);add(l2);
		add(c1);add(c2);add(c3);add(c4);
		add(l3);add(t1);
		add(r1);add(r2);
		add(l4);add(t2);
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new form();
	}
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource() instanceof JCheckBox) {
			if(ie.getSource()==c1) {
				if(c1.isSelected())
					t1.setText(Integer.parseInt(t1.getText())+2500+"");
				else
					t1.setText(Integer.parseInt(t1.getText())+-2500+"");
			}
			else if(ie.getSource()==c2) {
				if(c2.isSelected())
					t1.setText(Integer.parseInt(t1.getText())+2500+"");
				else
					t1.setText(Integer.parseInt(t1.getText())+2500+"");
			}
			else if(ie.getSource()==c3) {
				if(c3.isSelected())
					t1.setText(Integer.parseInt(t1.getText())+5000+"");
				else
					t1.setText(Integer.parseInt(t1.getText())-5000+"");
			}
			else {
				if(c4.isSelected())
					t1.setText(Integer.parseInt(t1.getText())+5000+"");
				else
					t1.setText(Integer.parseInt(t1.getText())-5000+"");
			}
		}
		else {
			if(ie.getSource()==r1) {
				t2.setEditable(false);
			}
			else
				t2.setEditable(true);
		}
	}

}
