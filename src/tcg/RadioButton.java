package tcg;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class RadioButton extends JFrame {
 private JRadioButton c1,
        c2;
 private JLabel myLabel;
 private RadioButtonHandler handler;

 
 
 public RadioButton(){
  super("tcg");
  setLayout( new FlowLayout() );
  handler = new RadioButtonHandler();
  
  myLabel = new JLabel("Escolha a sua carta");
  c1 = new JRadioButton("carta 1", false);
  c2 = new JRadioButton("carta 2", false);
  
  add(myLabel);
  add(c1);
  add(c2);

  c1.addItemListener(handler);
  c2.addItemListener(handler);
 }
 
 private class RadioButtonHandler implements ItemListener{

  @Override
  public void itemStateChanged(ItemEvent event) {
   if(c1.isSelected())
    JOptionPane.showMessageDialog(null,"carta 1");
   if(c2.isSelected())
    JOptionPane.showMessageDialog(null,"carta 2");
  }
  
 }

}