/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musik;

/**
 *
 * @author U53R
 */
public abstract class MusikPetik implements Musik{       
    public abstract void tampilkanNama();
    @Override
    public void caraBermain(){
        System.out.println("Dimainkan dengan cara di petik");
    }
    public abstract void tampilkanBahan();
    public abstract void nadaDasar();
}

