/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MikelAdamsLab01;

/**
 *
 * @author mikel.adams
 */
public class Counter {

    private int[] List = new int[6];
    
    public void Count(int x) {
        List[x - 1] = List[x - 1] + 1;
    }

    public void Print(int rolls) {
        System.out.println("After " + rolls + " the distribution is,");
        for (int i = 0; i < List.length; i++) {
            System.out.println(i + 1 + " was rolled " + List[i] + " (+" + ((List[i]*100)/rolls) + "%)");
        }
    }
}
