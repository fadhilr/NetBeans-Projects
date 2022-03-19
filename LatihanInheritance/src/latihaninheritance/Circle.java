/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

/**
 *
 * @author U53R
 */
public class Circle {
    private double radius=1.0;
    private String color="red";
    public Circle(){
        radius=2.0;
        color="blue";
    }
    public Circle(double radius){
        this.radius=radius;
        color="red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area=3.14*radius*radius;
        return area;
    }
    public String toString() {
        return  "radius=" + radius + "\n"
                +"color=" + color + "\n";
    }  
}
