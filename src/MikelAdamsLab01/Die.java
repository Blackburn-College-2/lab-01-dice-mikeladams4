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

    public int sides;
    Counter counter = new Counter();

    public int roll() {
        int result = 1 + (int) (Math.random() * ((sides - 1) + 1));
        return result;
    }

}
