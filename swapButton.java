package components;
import java.awt.*;
import java.awt.event.*;
public class swapButton extends Frame implements ActionListener{
	TextField t1,t2;
	Button b1;
	swapButton(){
		setLayout(new FlowLayout());
		t1=new TextField(20);
		t2=new TextField(20);
		b1=new Button("swap");
		b1.addActionListener(this);
		add(b1);add(t1);add(t2);
		setBounds(200,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new swapButton();

	}
	public void actionPerformed(ActionEvent ae) {
		String s=t1.getText();
		t1.setText(t2.getText());
		t2.setText(s);
	}

}
