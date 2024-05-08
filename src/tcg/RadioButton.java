package tcg;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class RadioButton extends JFrame {
 private JRadioButton java,
        csharp;
 private JLabel myLabel;
 private RadioButtonHandler handler;
 
 public RadioButton(){
  super("Radio Buttons - JavaProgressivo.net");
  setLayout( new FlowLayout() );
  handler = new RadioButtonHandler();
  
  myLabel = new JLabel("Qual a melhor linguagem de programação?");
  java = new JRadioButton("Java", false);
  csharp = new JRadioButton("C#", false);
  
  add(myLabel);
  add(java);
  add(csharp);

  java.addItemListener(handler);
  csharp.addItemListener(handler);
 }
 
 private class RadioButtonHandler implements ItemListener{

  @Override
  public void itemStateChanged(ItemEvent event) {
   if(java.isSelected())
    JOptionPane.showMessageDialog(null,"Parabéns, você é o cara");
   if(csharp.isSelected())
    JOptionPane.showMessageDialog(null,"Sabe de nada, inocente!");
  }
  
 }

}