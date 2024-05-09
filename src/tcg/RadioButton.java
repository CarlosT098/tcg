package tcg;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class RadioButton extends JFrame {
       private JRadioButton c1,c2, c3, c4, c5, c6, c7;
       private JLabel myLabel;
       private RadioButtonHandler handler;
       Random num = new Random();
       Scanner teclado = new Scanner(System.in);
       int controle = 0; //numero digitado pelo usuario
       int carta_bot = 0; //usado para o bot mudar de carta 
       int pontos = 0; //numero de cartas que o player perdeu
        
       //criação do baralho -> conjunto de cartas
       carta baralho1[] = new carta[7];
       carta baralho2[] = new carta[7];

public int resultado_da_luta(int atributo, int carta){
       switch(atributo){
              case 0:
                     JOptionPane.showMessageDialog(null, "empate");
                     return 0;
                              
              case 1:
                     JOptionPane.showMessageDialog(null, "Player + 1 ");
                     carta_bot ++;
                     return 1;                      
                              
              default:
                     JOptionPane.showMessageDialog(null, "bot +1");
                     baralho1[carta].disponivel = false;
                     pontos ++;
                     return 0;
       }
       
}
        
public void porrada(int n){
       if(baralho1[n].disponivel && baralho2[carta_bot].disponivel) { //verifica se as 2 cartas estao disponiveis
              batalha luta[] = new batalha[7];
              luta[0] = new batalha(baralho1[n], baralho2[carta_bot]);

              switch (luta[0].atributo_luta) { 
                     case 0: //forca      
                            JOptionPane.showMessageDialog(null,String.format("Atributo escolhido foi forca \n player forca = %d e bot forca = %d \n", baralho1[n].forca, baralho2[carta_bot].forca));                        
                            resultado_da_luta(luta[0].lutar(), n);
                     break;

                     case 1: //destreza
                            JOptionPane.showMessageDialog(null,String.format("Atributo escolhido foi destreza \n player destreza = %d e bot destreza = %d \n", baralho1[n].destreza, baralho2[carta_bot].destreza));                        
                            resultado_da_luta(luta[0].lutar(), n);                      
                     break; 

                     case 2://constituicao
                            JOptionPane.showMessageDialog(null,String.format("Atributo escolhido foi constituicao \n player constituicao = %d e bot constituicao = %d \n", baralho1[n].constituicao, baralho2[carta_bot].constituicao));                        
                            resultado_da_luta(luta[0].lutar(), n);
                     break;

                     case 3://inteligencia
                            JOptionPane.showMessageDialog(null,String.format("Atributo escolhido foi inteligencia \n player inteligencia = %d e bot inteligencia = %d \n", baralho1[n].inteligencia, baralho2[carta_bot].inteligencia));                        
                            resultado_da_luta(luta[0].lutar(), n);
                     break;

                     case 4://sabedoria
                            JOptionPane.showMessageDialog(null,String.format("Atributo escolhido foi sabedoria \n player sabedoria = %d e bot sabedoria = %d \n", baralho1[n].sabedoria, baralho2[carta_bot].sabedoria));                        
                            resultado_da_luta(luta[0].lutar(), n);
                     break;

                     default://carisma
                            JOptionPane.showMessageDialog(null,String.format("Atributo escolhido foi carisma \n player carisma = %d e bot carisma = %d \n", baralho1[n].carisma, baralho2[carta_bot].carisma));                        
                            resultado_da_luta(luta[0].lutar(), n);
                     break;
              }
       }else{
              JOptionPane.showMessageDialog(null, "carta invalida");
       }
}

public RadioButton(){
       super("tcg");
       setLayout( new FlowLayout() );
       handler = new RadioButtonHandler();

       for(int i = 0; i <=6; i++){
              baralho1[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
              baralho2[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
       }
       
       myLabel = new JLabel("Escolha a sua carta");
       c1 = new JRadioButton(baralho1[0].toString(), false);
       c2 = new JRadioButton(baralho1[1].toString(), false);
       c3 = new JRadioButton(baralho1[2].toString(), false);
       c4 = new JRadioButton(baralho1[3].toString(), false);
       c5 = new JRadioButton(baralho1[4].toString(), false);
       c6 = new JRadioButton(baralho1[5].toString(), false);
       c7 = new JRadioButton(baralho1[6].toString(), false);
  
       add(myLabel);
       add(c1);
       add(c2);
       add(c3);
       add(c4);
       add(c5);
       add(c6);
       add(c7);


       c1.addItemListener(handler);
       c2.addItemListener(handler);
       c3.addItemListener(handler);
       c4.addItemListener(handler);
       c5.addItemListener(handler);
       c6.addItemListener(handler);
       c7.addItemListener(handler);
 }
 
private class RadioButtonHandler implements ItemListener{

@Override
public void itemStateChanged(ItemEvent event) {
       if(c1.isSelected())
              porrada(0);
    
       if(c2.isSelected())
              porrada(1);
    
       if(c3.isSelected())
              porrada(2);
    
       if(c4.isSelected())
              porrada(3);
    
       if(c5.isSelected())
              porrada(4);
    
       if(c6.isSelected())
              porrada(5);
    
       if(c7.isSelected())
              porrada(6);
   
       }
  
}

}
