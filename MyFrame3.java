import java.awt.*;
public class MyFrame3 {
	Button b1,b2,b3;
	MyFrame3(){
		//GridLayout grid=new GridLayout(3,1);
		setLayout(new GridLayout(3,1));
		b1=new Button("ok.....");
		b2=new Button("cancle....");
		b3=new Button("ignore all....");
		add(b1);add(b2);add(b3);
		setTitle("grid frame");
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame3 f=new MyFrame3();
	}

}
