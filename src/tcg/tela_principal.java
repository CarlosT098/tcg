package tcg;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;


import javax.swing.*;

public class tela_principal extends JFrame{

public tela_principal()
{
	JPanel r = new JPanel(); 
	r.setLayout(new GridLayout(2,2));
	JLabel l1 = new JLabel("super tcg de fantasia"); 
    JButton bta = new JButton("jogar");
    add(r);
	r.add (l1);
    r.add(bta);   

    bta.addActionListener(e -> {
        setVisible(false);
        tela_batalha radioButtonFrame = new tela_batalha();
        radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        radioButtonFrame.setSize( 1000, 400 );
        radioButtonFrame.setVisible( true ); 
        
    });   

	setSize(500 , 200);
	setVisible(true);

}

}



