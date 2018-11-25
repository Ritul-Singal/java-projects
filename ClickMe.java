package components;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
class ClickMe extends JFrame{
	JButton b1;
	ImageIcon i1;
	ClickMe() {
		setLayout(null);
		//setLayout(new FlowLayout());
		i1=new ImageIcon("/home/dell/eclipse-workspace/projectjava/components/src/components/download.jpeg");
		i1=new ImageIcon(i1.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
		b1=new JButton(i1);
		b1.setSize(100,100);
		setUndecorated(true);
		add(b1);
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ClickMe.this,"you win");
				dispose();
			}
		});
		b1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me) {
				int rx=0,ry=0;
				Point p=b1.getLocation();
				int x=p.x;
				int y=p.y;
				if(me.getX()>=95&&me.getY()>=95)
					return;
				while(true) {
					Random r1=new Random();
					rx=r1.nextInt(400);
					ry=r1.nextInt(400);
					if(rx>=x&&rx<=x+100||ry>=y&&ry<=y+100)
						break;
				}
				b1.setLocation(rx, ry);
			}
		});
		b1.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent ke) {
				char ch=ke.getKeyChar();
				if(ch==32)
					ke.consume();
			}
		});
		
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickMe();
	}

}
