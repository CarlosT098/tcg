/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcg;
import java.util.Random;

/**
 *
 * @author carlos
 */
public class Tcg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random num = new Random();
        
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
        
        for(int i = 0; i<=6; i++){
            batalha luta = new batalha(baralho1[i], baralho2[i]);
            System.out.println(luta.lutar());
        }
        
    }
    
}
