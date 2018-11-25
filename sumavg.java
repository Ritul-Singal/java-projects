import java.awt.*;
import java.awt.event.*;
public class sumavg extends Frame implements ActionListener{
	Button b1,b2,b3,b4;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	sumavg(){
		setLayout(new FlowLayout());
		b1=new Button("sum");
		b2=new Button("avg");
		b3=new Button("div");
		b4=new Button("mup");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		l1=new Label("no 1");
		l2=new Label("no 2");
		l3=new Label("result");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		add(b3);add(b4);
		setBounds(0,0,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sumavg();
	}
	public void actionPerformed(ActionEvent ae) {
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		Button b=(Button)ae.getSource();
		if(b==b1)
			t3.setText(Integer.toString(x+y));
		else {
			if(b==b2)
				t3.setText(Float.toString((x+y)/2);
				else if(b==b3)
					t3.setText(Float.toString(x/y));
				else
					t3.setText(Integer.toString(x*y));
		}
	}
}
