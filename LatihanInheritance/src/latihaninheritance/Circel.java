/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;


public class Circel extends Shape{
    private double radius=1.0;
    public Circel(){
        
    }
    public Circel(double radius){
        this.radius=radius;
    }
    public Circel(double radius,String color, boolean filled){
        setColor(color);
        setFilled(filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area=3.14*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter=3.14*2*radius;
        return perimeter;
    }
    public String toString(){
        return super.toString()+"\n"
                + "Area= "+getArea()+"\n"
                + "Perimeter= "+getPerimeter()+"\n";
    }
}
