/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2bab5s2;

public class Vehicle1 {

    private double load;
    private static final double maxLoad = 10000;
    
// public Vehicle1 (double max) {
//        this.maxLoad = max;
//    }
    public double getLoad() {
        return this.load;
    }
    public double getMaxLoad() {
        return this.maxLoad;
    }
    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
