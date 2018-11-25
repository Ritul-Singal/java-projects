import java.awt.*;
public class MyFrame1 extends Frame{
	Button b1,b2,b3,b4,b5;
	Panel p1;
	MyFrame1(){
		b1=new Button("ok");
		b2=new Button("cancle");
		b3=new Button("b");
		b4=new Button("i");
		b5=new Button("u");
		p1=new Panel();
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		add(p1,BorderLayout.SOUTH);
		add(b1,"North");
		add(b2);
		setTitle("my FirstFrame");
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame1();
	}

}
