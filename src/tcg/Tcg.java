/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcg;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Tcg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaração de variavel
        Random num = new Random();
        Scanner teclado = new Scanner(System.in);
        int controle = 0;
        int carta_bot =0;
        int pontos = 0;
        
        carta baralho1[] = new carta[7];
        for(int i = 0; i <=6; i++){
            baralho1[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
        //System.out.println(baralho1[i].toString());
        }

        carta baralho2[] = new carta[7];
        for(int i = 0; i <=6; i++){
            baralho2[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
        //System.out.println(baralho2[i].toString());
        }

        while (controle <7) {   
            if (carta_bot == 7) {
                System.out.println("Player wins");
                break;
            }else if (pontos == 7) {
                System.out.println("Bot wins");
                break;
            }else if (controle>=7) {
                System.out.println("Saindo...");
                break;
            }else{
                System.out.println("------------------------------------------");
                System.out.println("suas cartas:");
                for (int i = 0; i <= 6; i++){
                    if (baralho1[i].disponivel) {
                        System.out.println(baralho1[i].toString()); 
                    }                                   
                }
                System.out.println("------------------------------------------");
                System.out.println("cartas bot:");
                for (int i = 0; i <= 6; i++){
                    if (baralho2[i].disponivel) {
                        System.out.println(baralho2[i].toString());
                    }                                    
                }
                System.out.print("Digite um numero: ");
                controle = teclado.nextInt();
                if (baralho1[controle].disponivel && baralho2[carta_bot].disponivel) {
                    batalha luta[] = new batalha[7];
                    luta[0] = new batalha(baralho1[controle], baralho2[carta_bot]);
                    System.out.println(luta[0].lutar());
                    switch (luta[0].atributo_luta) {
                        case 0: //forca
                            System.out.println("Atributo escolhido foi forca");                   
                            System.out.format("player forca = ", baralho1[controle].forca);
                            System.out.format("bot forca = ", baralho2[controle].forca);
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
                            System.out.format("player destreza = ", baralho1[controle].destreza);
                            System.out.format("bot destreza = ", baralho2[controle].destreza);
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
                            System.out.format("player constituicao = ", baralho1[controle].constituicao);
                            System.out.format("bot constituicao = ", baralho2[controle].constituicao);
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
                            System.out.format("player inteligencia = ", baralho1[controle].inteligencia);
                            System.out.format("bot inteligencia = ", baralho2[controle].inteligencia);
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
                            System.out.format("player sabedoria = ", baralho1[controle].sabedoria);
                            System.out.format("bot sabedoria = ", baralho2[controle].sabedoria);
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
                            System.out.format("player carisma = ", baralho1[controle].carisma);
                            System.out.format("bot carisma = ", baralho2[controle].carisma);
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
            
    }
    
}

