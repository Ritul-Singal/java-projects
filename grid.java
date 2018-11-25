import java.awt.*;
public class grid extends Frame{
	Button b1,b2,b3,b4,b5;
	Panel p1,p2;
	TextArea t1;
	grid(){
		b1=new Button("ok");
		b2=new Button("cancle");
		b3=new Button("B");
		b4=new Button("I");
		b5=new Button("U");
		p1=new Panel();
		p2=new Panel();
		t1=new TextArea(); 
		p1.add(b1);
		p1.add(b2);
		p2.setLayout(new GridLayout(3,1));
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar sb2=new Scrollbar(Scrollbar.HORIZONTAL);
		//add(sb1);
		//add(sb2);
		add(t1);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.WEST);
		add(sb1,BorderLayout.EAST);add(sb2,BorderLayout.SOUTH);
		setBounds(10,20,200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new grid();
	}

}
