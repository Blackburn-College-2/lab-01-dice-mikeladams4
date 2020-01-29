/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MikelAdamsLab01;

import java.util.Scanner;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How may dice?");
        int dice = input.nextInt();
        System.out.println("How many sides?");
        int sides = input.nextInt();
        System.out.println("How often should I print?");
        int rolls = input.nextInt();
        while (true) {
            Roller roller = new Roller();
            roller.rollAll(rolls,dice,sides);
        }
    }

}
