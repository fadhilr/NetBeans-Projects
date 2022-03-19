/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasStudent;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
//menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();
//siswa  dengan  nama  anna  dirubah  informasi  alamat  dan  umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();
//siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        System.out.print("Masukkan banyak siswa :");
        int n = input.nextInt();
        Student[] siswa = new Student[n];
        for(int a =0;a<n;a++){
            System.out.print("Masukkan nama = ");
            String nama = input1.nextLine();
            System.out.print("Masukkan alamat = ");
            String alamat = input1.nextLine();
            System.out.print("Masukkan umur = ");
            int umur = input.nextInt();
            siswa[a]=new Student(nama, alamat, umur);
            System.out.print("Masukkan nilai math = ");
            int math=input.nextInt();
            siswa[a].setMath(math);
            System.out.print("Masukkan nilai english = ");
            int eng=input.nextInt();
            siswa[a].setEnglish(eng);
            System.out.print("Masukkan nilai science = ");
            int sci=input.nextInt();
            siswa[a].setScience(sci);
            System.out.println("----------------------");
        }
        for(int a=0;a<n;a++){
            siswa[a].displayMessage();  
        }
        anna.jumlahObjek();    
    }   
}
