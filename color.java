import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class color extends JFrame implements ActiveListener{
	Scrollbar sb1,sb2,sb3;
	TextField t1;
	
	color(){
		t1=new TextField();
		sb1=new Scrollbar(Scrollbar.HORIZONTAL);
		sb2=new Scrollbar(Scrollbar.HORIZONTAL);
		sb3=new Scrollbar(Scrollbar.HORIZONTAL); 
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
