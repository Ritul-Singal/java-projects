import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Combobox extends JFrame implements ItemListener{
	JComboBox<String> jc1;
	JTextField t1;
	String m[]= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
	JPanel p;
	public Combobox() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		jc1=new JComboBox<>(m);
		p=new JPanel();
		jc1.addItemListener(this);
		t1=new JTextField(20);
		t1.setEditable(false);
		add(jc1);
		add(t1);
		setBounds(0,0,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Combobox();
	}
	public void itemStateChanged(ItemEvent ie) {
		int n=jc1.getSelectedIndex()+1;
		if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
			t1.setText("31 days");
		else if(n==2)
			t1.setText("28 or 29 days");
		else 
			t1.setText("30 days");
	}

}
