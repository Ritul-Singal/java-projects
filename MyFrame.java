import java.awt.*;
public class MyFrame extends Frame{
	Button b1,b2,b3,b4,b5;
	Panel p1;
	MyFrame(){
		b1=new Button("ok");
		b2=new Button("cancle");
		b3=new Button("b");
		b4=new Button("i");
		b5=new Button("u");
		p1=new Panel();
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		setVisibility(true);
	}
	public static void main(String args[]) {
		MyFrame f=new MyFrame();
	}
}

