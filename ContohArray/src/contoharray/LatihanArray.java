/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Pilihan hari= ");
        int hari=input.nextInt();
        String arr[]={"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        System.out.println("hari yang dimasukkan= "+arr[hari]);
    }
}
