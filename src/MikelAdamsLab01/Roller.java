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
public class Roller {

    Die die = new Die();
    Counter counter = new Counter();

    public void rollAll(int rolls, int dice, int sides) {
        die.sides = sides;
        counter.List = new int[(dice*sides)];
        int x = 0;
        while (true) {
            int i = 0;
            while (i < rolls) {
                x = x + 1;
                i = i + 1;
                int result = 0;
                for (int y = 0; y < dice; y++) {
                    result = result + die.roll();
                }
                counter.Count(result);
            }
            counter.Print(x,dice);
        }
    }
}
