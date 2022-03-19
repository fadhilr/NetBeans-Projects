/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

public class MainCircle {
    public static void main(String[] args) {
        Cylinder objek1= new Cylinder();
        Cylinder objek2= new Cylinder(4.0);
        Cylinder objek3= new Cylinder(3.0,5.0);
        System.out.println("Cylinder 1 : \n"+objek1);
        System.out.println("Cylinder 2 : \n"+objek2);
        System.out.println("Cylinder 3 : \n"+objek3);
        
    }
}
