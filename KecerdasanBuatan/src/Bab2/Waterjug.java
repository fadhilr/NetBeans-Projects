/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2;

import java.util.*;

public class Waterjug {
    
    int a_max = 5;
    int b_max = 3;
    int a = 0;
    int b = 0;
    int goal = 4;

    void checkGoal() {

        int fin = 0;
        int i = 0;
        System.out.println("Isi ember a = "+this.a_max);
        System.out.println("Isi ember b = "+this.b_max);
        System.out.println("Goal        = "+goal);
        while (fin != 1) {
            i++;
            if ((this.a == this.goal) || (this.b == this.goal)) {
                fin = 1;
                if(this.a == this.goal){
                    emptyB();break;
                }else{
                    emptyA();break;
                }
            }

            if (this.a == 0) {
                fillA();
            }  else if ((this.a > 0) && (this.b != this.b_max)) {
                transferAtoB();
            }else if ((this.a > 0) && (this.b == this.b_max)) {
                emptyB();
            }
        }
        System.out.println("Proses pengambilan "+goal+" liter air selesai....");
        System.out.println("Pengisian selesai setelah "+i+" kali percobaan");
    }
    
    void fillA() {

        this.a = this.a_max;
        System.out.print("Isi ember a dengan "+ this.a+" liter\t");
        System.out.println("{" + this.a + "," + this.b + "}");

    }

    void fillB() {
        this.b = this.b_max;
        System.out.print("Isi ember b dengan "+ this.b+" liter\t");
        System.out.println("{" + this.a + "," + this.b + "}");
    }

    void transferAtoB() {

        int fin = 0;

        while (fin != 1) {

            this.b += 1;
            this.a -= 1;

            if ((this.b == this.b_max) || (this.a == 0)) {
                fin = 1;
            }

        }

        System.out.print("Pindah air di ember a ke b\t");
        System.out.println("{" + this.a + "," + this.b + "}");

    }
    
    void transferBtoA() {

        int fin = 0;

        while (fin != 1) {

            this.a += 1;
            this.b -= 1;

            if ((this.a == this.a_max) || (this.b == 0)) {
                fin = 1;
            }

        }

        System.out.print("Pindah air di ember b ke a\t");
        System.out.println("{" + this.a + "," + this.b + "}");

    }

    void emptyA() {

        this.a = 0;
        System.out.print("Buang isi air a\t\t\t");
        System.out.println("{" + this.a + "," + this.b + "}");

    }

    void emptyB() {
        this.b = 0;
        System.out.print("Buang isi air b\t\t\t");
        System.out.println("{" + this.a + "," + this.b + "}");
    }

}

