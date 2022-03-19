/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

public class Square extends Rectangle{
    
    public Square(){
        super.setWidth(1.0);
    }
    public Square(double side){
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled){
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public void setSide(double side) {
        super.setWidth(side);
    }

    public double getSide() {
        return super.getWidth();
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString (){
        return super.toString()+"Side= "+getSide()+"\n";
    }
}
