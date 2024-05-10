package tcg;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Tcg {
    public static void main(String[] args) {
        /* 
        //declaração de variavel
        Random num = new Random();
        Scanner teclado = new Scanner(System.in);
        int controle = 0; //numero digitado pelo usuario
        int carta_bot = 0; //usado para o bot mudar de carta 
        int pontos = 0; //numero de cartas que o player perdeu
        
        //criação do baralho -> conjunto de cartas
        carta baralho1[] = new carta[7];
        carta baralho2[] = new carta[7];
        for(int i = 0; i <=6; i++){
            baralho1[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
            baralho2[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
        }

        //menu de interação com o usuario
        while (controle <7) {   
            if (carta_bot == 7) {
                System.out.println("Player wins");
                break;
            }else if (pontos == 7) {
                System.out.println("Bot wins");
                break;
            } else{
                System.out.println("------------------------------------------");
                System.out.println("suas cartas:"); //mostar quais cartas o usuario pode usar
                for (int i = 0; i <= 6; i++){
                    if (baralho1[i].disponivel) {                        
                        System.out.println(i + " -> " + baralho1[i].toString()); 
                    }                                   
                }
                System.out.println("------------------------------------------");
                System.out.println("cartas bot:"); //mostrar quais cartas o bot ainda tem
                for (int i = 0; i <= 6; i++){
                    if (baralho2[i].disponivel) {
                        System.out.println(baralho2[i].toString());
                    }                                    
                }
                System.out.print("Digite um numero: "); //entrada do valor digitado pelo usuario
                controle = teclado.nextInt();
                if (controle>=7) { //verifica se é um valor valido
                    System.out.println("Saindo...");
                    break;
                } else
                if (baralho1[controle].disponivel && baralho2[carta_bot].disponivel) { //verifica se as 2 cartas estao disponiveis
                    batalha luta[] = new batalha[7];
                    luta[0] = new batalha(baralho1[controle], baralho2[carta_bot]);
                    switch (luta[0].atributo_luta) { 
                        case 0: //forca
                            System.out.println("Atributo escolhido foi forca");                   
                            System.out.format("player forca = %d \n", baralho1[controle].forca);
                            System.out.format("bot forca = %d \n", baralho2[carta_bot].forca);
                            switch (luta[0].lutar()) {
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Player + 1");
                                    carta_bot ++;                            
                                    break;
                                default:
                                    System.out.println("Bot + 1");
                                    pontos ++;
                                    break;
                            }
                            break;
                        case 1: //destreza
                            System.out.println("Atributo escolhido foi destreza");
                            System.out.format("player destreza = %d \n", baralho1[controle].destreza);
                            System.out.format("bot destreza = %d \n", baralho2[carta_bot].destreza);
                            switch (luta[0].lutar()) {
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Player + 1");
                                    carta_bot ++;                            
                                    break;
                                default:
                                    System.out.println("Bot + 1");
                                    pontos ++;
                                    break;
                            }
                            break; 
                        case 2://constituicao
                            System.out.println("Atributo escolhido foi constituicao");
                            System.out.format("player constituicao = %d \n", baralho1[controle].constituicao);
                            System.out.format("bot constituicao = %d \n", baralho2[carta_bot].constituicao);
                            switch (luta[0].lutar()) {
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Player + 1");
                                    carta_bot ++;                            
                                    break;
                                default:
                                    System.out.println("Bot + 1");
                                    pontos ++;
                                    break;
                            }
                            break;
                        case 3://inteligencia
                            System.out.println("Atributo escolhido foi inteligencia");
                            System.out.format("player inteligencia = %d \n", baralho1[controle].inteligencia);
                            System.out.format("bot inteligencia = %d \n", baralho2[carta_bot].inteligencia);
                            switch (luta[0].lutar()) {
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Player + 1");
                                    carta_bot ++;                            
                                    break;
                                default:
                                    System.out.println("Bot + 1");
                                    pontos ++;
                                    break;
                            }
                            break;
                        case 4://sabedoria
                            System.out.println("Atributo escolhido foi sabedoria");
                            System.out.format("player sabedoria = %d \n", baralho1[controle].sabedoria);
                            System.out.format("bot sabedoria = %d \n", baralho2[carta_bot].sabedoria);
                            switch (luta[0].lutar()) {
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Player + 1");
                                    carta_bot ++;                            
                                    break;
                                default:
                                    System.out.println("Bot + 1");
                                    pontos ++;
                                    break;
                            }
                            break;
                        default://carisma
                            System.out.println("Atributo escolhido foi carisma");
                            System.out.format("player carisma = %d \n", baralho1[controle].carisma);
                            System.out.format("bot carisma = %d \n", baralho2[carta_bot].carisma);
                            switch (luta[0].lutar()) {
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Player + 1");
                                    carta_bot ++;                            
                                    break;
                                default:
                                    System.out.println("Bot + 1");
                                    pontos ++;
                                    break;
                            }
                            break;
                    }
                }else{
                    System.out.println("Digite uma carta valida"); 
                }
            }
            
        }

        */

      
        //adicionar interface grafica swing    
        RadioButton radioButtonFrame = new RadioButton();
        radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        radioButtonFrame.setSize( 1000, 400 );
        radioButtonFrame.setVisible( true );
       
            
    }
        
}

