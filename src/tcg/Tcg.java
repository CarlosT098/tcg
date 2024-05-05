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
        /*
        carta baralho[] = new carta[7];
        baralho[0] = new carta("guerreiro", 1,1,1,1,1,1,1,1);
        System.out.println(baralho[0].toString());
        baralho[1] = new carta("assasino", 1,2,1,1,1,1,1,1);
        System.out.println(baralho[1].toString());
        baralho[2] = new carta("mago", 1,3,1,1,1,1,1,1);
        System.out.println(baralho[2].toString());
        baralho[3] = new carta("bardo", 1,4,1,1,1,1,1,1);
        System.out.println(baralho[3].toString());
        baralho[4] = new carta("clerigo", 1,5,1,1,1,1,1,1);
        System.out.println(baralho[4].toString());
        baralho[5] = new carta("ranger", 1,6,1,1,1,1,1,1);
        System.out.println(baralho[5].toString());
        baralho[6] = new carta("desconhecido", 1,7,1,1,1,1,1,1);
        System.out.println(baralho[6].toString());
        */
        
        Random num = new Random();
        
        carta baralho[] = new carta[7];
        for(int i = 0; i <=6; i++){
            baralho[i] = new carta(num.nextInt(6),num.nextInt(6),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10),num.nextInt(10));
        System.out.println(baralho[i].toString());
        }
        
        
        
    }
    
}
