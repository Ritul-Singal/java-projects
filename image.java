package components;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class image extends JFrame{
	ImageIcon ii,i2;
	JLabel l1;
	JButton b1;
	public image() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		ii=new ImageIcon("/home/dell/eclipse-workspace/projectjava/components/src/components/images.jpeg");
		i2=new ImageIcon(ii.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
		l1=new JLabel(i2);
		b1=new JButton(i2);
		//add(l1);
		add(b1);
		setBounds(0,0,400,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new image();

	}

}
