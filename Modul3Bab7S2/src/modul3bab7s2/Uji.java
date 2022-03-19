/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab7s2;

/**
 *
 * @author U53R
 */
public class Uji {
    public static void main(String[] args) {
        SalariedEmployee a=new SalariedEmployee("Daniel", "135", 800.00,"25-mei-1998",20,10.0);
        SalariedEmployee b=new SalariedEmployee("Samuel", "123", 800.00,"25-juni-1998",25,10.0);
        SalariedEmployee c=new SalariedEmployee("Indra", "137", 800.00,"25-agustus-1998",5,10.0);
        SalariedEmployee d=new SalariedEmployee("Bekti", "214", 800.00,"25-mei-1998",18,10.0);
        Employee[] pegawai= new Employee[4];
        pegawai[0]=a;
        pegawai[1]=b;
        pegawai[2]=c;
        pegawai[3]=d;
        for(Employee objek:pegawai){
            System.out.println(objek);
            System.out.println("");
        }
    }
}
