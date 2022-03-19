/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasStudent;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private boolean result;
    static int jumlah;
    
    
    public Student(int math, int english, int science) {
        mathGrade=math;
        englishGrade=english;
        scienceGrade=science;
        jumlah++;
    }
    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlah++;
    }
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlah++;
    }
    public void setName(String n) {
        name = n;
    }
    public void setAddress(String a) {
        address = a;
    }
    public void setAge(int ag) {
        age = ag;
    }
    public void setMath(int math) {
        mathGrade = math;
    }
    public void setEnglish(int english) {
        englishGrade = english;
    }
    public void setScience(int science) {
        scienceGrade = science;
    }
    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }
    public boolean statusAkhir( ){
        this.result= getAverage()>=61;
        return this.result;
    }
    public void jumlahObjek(){
        System.out.println("Jumlah objek = "+jumlah);
    }
    public void displayMessage() {
        System.out.println("Siswa dengan nama =" + name);
        System.out.println("beramalat di \t=" + address);
        System.out.println("berumur \t=" + age);
        System.out.println("mempunyai \t=" + getAverage());
        if (statusAkhir()==true) {
            System.out.println("Hasil akhir \t= Lolos");
        } else {
            System.out.println("Hasil akhir \t= Remidi");
        }
        System.out.println("Banyak siswa ");
    }
}
