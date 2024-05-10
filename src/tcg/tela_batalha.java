package tcg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class tela_batalha extends JFrame {
       private JRadioButton c1,c2, c3, c4, c5, c6, c7;
       private JLabel label_player, b1, b2,b3,b4,b5,b6,b7, label_bot;
       private RadioButtonHandler handler;
       JButton bta = new JButton("voltar");

       Random num = new Random();
       int controle = 0; //numero digitado pelo usuario
       int carta_bot = 0; //usado para o bot mudar de carta 
       int pontos = 0; //numero de cartas que o player perdeu
        
       //criação do baralho -> conjunto de cartas
       carta baralho1[] = new carta[7];
       carta baralho2[] = new carta[7];

public boolean check(){
       if (pontos >= 7) {
              JOptionPane.showMessageDialog(null, "Bot wins");
              return false;
       }else if (carta_bot >= 7) {
              JOptionPane.showMessageDialog(null, "player wins");
              return false;
       }else{
              return true;              
       }       
}

public void verficacao(int n){
       if(check()){
              porrada(n);
       }
}

public int resultado_da_luta(int atributo, int carta){
       switch(atributo){
              case 0:
                     JOptionPane.showMessageDialog(null, "empate");
                     return 0;
                              
              case 1:
                     JOptionPane.showMessageDialog(null, "Player + 1 ");
                     baralho2[carta_bot].disponivel = false;
                     apagar_bot(carta_bot);
                     carta_bot ++;   
                     repaint();                  
                     revalidate();
                     check();
                     return 1;                      
                              
              default:
                     JOptionPane.showMessageDialog(null, "bot +1");
                     baralho1[carta].disponivel = false;
                     pontos ++;
                     apagar_player(carta);
                     repaint();
                     revalidate();
                     check();
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

public void apagar_bot(int n){
       switch (n) {
              case 0:
                     remove(b1);
                     break;

              case 1:
                     remove(b2);
                     break;
              
              case 2:
                     remove(b3);
                     break;
                     
              case 3:
                     remove(b4);
                     break;
              case 4:
                     remove(b5);
                     break;
              case 5:
                     remove(b6);
                     break;
              case 6:
                     remove(b7);
                     break;
       }
}

public void apagar_player(int n){
       switch (n) {
              case 0:
                  remove(c1);
                  break;
              case 1:
                  remove(c2);
                  break;
              case 2:
                  remove(c3);
                  break;
              case 3:
                  remove(c4);
                  break;
              case 4:
                  remove(c5);
                  break;
              case 5:
                  remove(c6);
                  break;
              case 6:
                  remove(c7);
                  break;
          }
          
}

public tela_batalha(){       
       super("tcg");
       setLayout( new FlowLayout() );
       handler = new RadioButtonHandler();

       for(int i = 0; i <=6; i++){
              baralho1[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
              baralho2[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
       }


       label_bot = new JLabel("Cartas do bot");
       b1 = new JLabel(baralho2[0].toString());
       b2 = new JLabel(baralho2[1].toString());
       b3 = new JLabel(baralho2[2].toString());
       b4 = new JLabel(baralho2[3].toString());
       b5 = new JLabel(baralho2[4].toString());
       b6 = new JLabel(baralho2[5].toString());
       b7 = new JLabel(baralho2[6].toString());

       label_player = new JLabel("Escolha a sua carta \n");       
       c1 = new JRadioButton(baralho1[0].toString(), false);
       c2 = new JRadioButton(baralho1[1].toString(), false);
       c3 = new JRadioButton(baralho1[2].toString(), false);
       c4 = new JRadioButton(baralho1[3].toString(), false);
       c5 = new JRadioButton(baralho1[4].toString(), false);
       c6 = new JRadioButton(baralho1[5].toString(), false);
       c7 = new JRadioButton(baralho1[6].toString(), false);
       
       add(label_bot);
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(b6);
       add(b7);
       add(label_player);
       add(c1);
       add(c2);
       add(c3);
       add(c4);
       add(c5);
       add(c6);
       add(c7);
       add(bta);


       c1.addItemListener(handler);
       c2.addItemListener(handler);
       c3.addItemListener(handler);
       c4.addItemListener(handler);
       c5.addItemListener(handler);
       c6.addItemListener(handler);
       c7.addItemListener(handler);

       bta.addActionListener(e -> {
              setVisible(false);
              tela_principal p = new tela_principal();
              p.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

              
          });  

       setLayout(new GridLayout(20,1));
       setSize(getPreferredSize());
 }
 
private class RadioButtonHandler implements ItemListener{

@Override
public void itemStateChanged(ItemEvent event) {
       if(c1.isSelected())
              verficacao(0);                   
    
       if(c2.isSelected())
              verficacao(1);
    
       if(c3.isSelected())
              verficacao(2);
    
       if(c4.isSelected())
              verficacao(3);
    
       if(c5.isSelected())
              verficacao(4);
    
       if(c6.isSelected())
              verficacao(5);
    
       if(c7.isSelected())
              verficacao(6);   
       }
  
}

}

