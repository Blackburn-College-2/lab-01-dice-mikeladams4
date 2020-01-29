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
public class Die {

    private int sides;
    Counter counter = new Counter();

    public Die() {
        sides = 6;
    }

    public int roll() {
        int result = 1 + (int) (Math.random() * ((6 - 1) + 1));
        return result;
    }

}
