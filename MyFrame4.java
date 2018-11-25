import java.awt.*;
import java.awt.event.*;
public class MyFrame4 extends Frame implements ActionListener{
	Button b1,b2;
	MyFrame4(){
		setLayout(new FlowLayout());
		b1=new Button("msg1");
		b2=new Button("msg2");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Button b=(Button)ae.getSource();
				if(b==b1)
					System.out.println("hello");
				else
					System.out.println("bye");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Button b=(Button)ae.getSource();
				if(b==b1)
					System.out.println("hello");
				else
					System.out.println("bye");
			}
		});
		add(b1);add(b2);
		setBounds(200,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame4();
	}
	

}


