/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

public class MainShape {
    public static void main(String[] args) {
        Square square1= new Square();
        Square square2= new Square(2.0);
        Square square3= new Square(3.0,"blue",true);
        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2=new Rectangle(4.0,4.0);
        Rectangle rectangle3=new Rectangle(5.0,5.0,"green",false);
        Circel circel1=new Circel();
        Circel circel2=new Circel(3.0);
        Circel circel3=new Circel(4.0,"yellow",true);
        System.out.println("Square 1: \n"+square1);
        System.out.println("Square 2: \n"+square2);
        System.out.println("Square 3: \n"+square3);
        System.out.println("Rectangle 1: \n"+rectangle1);
        System.out.println("Rectangle 2: \n"+rectangle2);
        System.out.println("Rectangle 3: \n"+rectangle3);
        System.out.println("Circel 1: \n"+circel1);
        System.out.println("Circel 2: \n"+circel2);
        System.out.println("Circel 3: \n"+circel3);
    }
}
