/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){
        
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        setColor(color);
        setFilled(filled);
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
        double area=width*length;
        return area;
    }
    public double getPerimeter(){
        double perimeter=(2*width)+(2*length);
        return perimeter;        
    }
    public String toString(){
        return super.toString()+"\nlength= "+length+"\n"
                + "width= "+width+"\n"
                + "Area= "+getArea()+"\n"
                + "Perimeter= "+getPerimeter()+"\n";
    }
}
