package components;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class window extends Frame{
	
	public window() {
		// TODO Auto-generated constructor stub
		setBounds(0,0,400,300);
		addWindowListener(new A());
		setVisible(true);
	}
	public static void main(String[] args) {
		new window();
	}
}
	class A extends WindowAdapter{
	public void windowOpened(WindowEvent we) {}
	public void windowClosing(WindowEvent we) {
		we.getWindow().dispose();
	}
}
