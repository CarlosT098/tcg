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

        while (controle <= 10) {
            for (int i = 0; i <= 6; i++){
                System.out.println("------------------------------------------");
                System.out.println(baralho1[i].toString());                
            }
            System.out.print("Digite um numero: ");
            controle = teclado.nextInt();

            batalha luta[] = new batalha[7];
            luta[0] = new batalha(baralho1[controle], baralho2[0]);
            System.out.println(luta[0].lutar());
        }
    
}

}
