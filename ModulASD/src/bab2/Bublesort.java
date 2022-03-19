/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2;

/**
 *
 * @author U53R
 */
public class Bublesort {
    public static void main(String[] args) {
        int[] angka = {6,8,1,4,2,7};
int i,j,k,temp;
System.out.println("Sebelum diurutkan :");
for(i=0;i < angka.length;i++){
System.out.print(angka[i]+" ");
}
System.out.println("\n");
for(i=1; i < angka.length-1;i++){
System.out.println("Iterasi "+ i);
for(j=angka.length-1;j >=i; j--){
if(angka[j] < angka[j-1]){
temp = angka[j];
angka[j] = angka[j-1];
angka[j-1] = temp;
}
for(k=0;k < angka.length; k++){
System.out.print(angka[k]+"\t");
}
System.out.println();
}
}

System.out.println("Setelah diurutkan :");
for(i=0; i < angka.length;i++)
System.out.print(angka[i]+" ");
}
}

