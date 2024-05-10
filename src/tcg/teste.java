package tcg;

import java.awt.GridLayout;

import javax.swing.*;

public class teste extends JFrame{

public teste()
{
	JPanel r = new JPanel(); 
	r.setLayout(new GridLayout(2,2));
	JLabel l1 = new JLabel("Nome:"); 
	r.add (l1); 
	JTextField t1 = new JTextField(10); 
	r.add (t1); 

	JLabel l2 = new JLabel("Matricula:"); 
	r.add (l2); 
	JTextField t2 = new JTextField(10); 
	r.add (t2); 
	
	add(r);
	setSize(400 , 100);
	setVisible(true);

}

}



