/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1;

public class AgenCerdas {
    private String lingkungan[][];
    AgenCerdas(int location){
        lingkungan = new String[location][3];
    }
    public void setKondisi(int i, String Nama,String location,String status){
        lingkungan[i-1][0]=Nama;
        lingkungan[i-1][1]=location;
        lingkungan[i-1][2]=status;
    }
    public void vacumm (int i,String location, String status){
        if ("kotor".equals(status.toLowerCase())){
            System.out.println("----bersih-bersih----");
            status = "bersih";
            lingkungan[i][2]=status;
            vacumm(i,location,status);
        }else if ("kiri atas".equals(location.toLowerCase())){
            System.out.println("Sudah bersih");
            System.out.println("geser kanan-->");
        }else if ("tengah atas".equals(location.toLowerCase())){
            System.out.println("Sudah bersih");
            System.out.println("geser kanan-->");
        }else if ("kanan atas".equals(location.toLowerCase())){
            System.out.println("Sudah bersih");
            System.out.println("turun kebawah");
        }else if ("kanan bawah".equals(location.toLowerCase())){
            System.out.println("Sudah bersih");
            System.out.println("<--geser kekiri");
        }else if ("tengah bawah ".equals(location.toLowerCase())){
            System.out.println("Sudah bersih");
            System.out.println("<--geser kekiri");
        }else if ("kiri bawah ".equals(location.toLowerCase())){
            System.out.println("berhenti");
        }
        }
    public void bersihkan(){
        for (int i = 0; i<lingkungan.length; i++){
            System.out.println("Lokasi "+lingkungan[i][0]);
            vacumm(i,lingkungan[i][1],lingkungan[i][2]);
        }
        cek(); 
    }
    public void cek (){
        for (int i = 0; i<lingkungan.length; i++){
            if(!"bersih".equals(lingkungan[i][2])){
                bersihkan();
                break;
            }
        }
        System.out.println("SEMUA SUDAH BERSIH");
    }
    public static void main(String[] args) {
        AgenCerdas a = new AgenCerdas(6);
        a.setKondisi(1, "Lokasi 1", "kiri atas", "kotor");
        a.setKondisi(2, "Lokasi 2", "tengah atas", "kotor");
        a.setKondisi(3, "Lokasi 3", "kanan atas", "bersih");
        a.setKondisi(4, "Lokasi 4", "kanan bawah", "kotor");
        a.setKondisi(5, "Lokasi 5", "tengah bawah", "kotor");
        a.setKondisi(6, "Lokasi 6", "kiri bawah", "bersih");
        a.bersihkan();
    }
}

