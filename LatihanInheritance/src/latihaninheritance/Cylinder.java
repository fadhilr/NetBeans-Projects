/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

public class Cylinder extends Circle{
    private double height=1.0;
    public Cylinder(){
        super();
        height=2.0;
    }
    public Cylinder(double radius){
        super(radius);
        height=4.0;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double volume=getArea()*height;
        return volume;
    }
    public String toString(){
        return super.toString()
                + "height=" + height + "\n"
                + "volume= "+getVolume() +"\n";
    }
}
