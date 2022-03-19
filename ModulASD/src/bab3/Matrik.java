/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3;

import bab2.Larik;

public class Matrik {
    
    int nBaris, nKolom;
    double[][] itemDt;
 
    public Matrik(int a, int b) {
        nBaris = a; nKolom = b;
        itemDt = new double[nBaris][nKolom];
    }

    public Matrik(double[][] dt) { 
        nBaris = dt.length;
        nKolom = dt[0].length;
        this.itemDt = new double[nBaris][nKolom];
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {                  
                this.setItem(i, j, dt[i][j]);
            }
        }
    }
    public int getNBaris() {
        return nBaris;
    }

    public int getNKolom() {
        return nKolom;
    }

    public double getItem(int idB, int idK) {
        return this.itemDt[idB][idK];
    }

    public void setItem(int idB, int idK, double dt) {
        this.itemDt[idB][idK] = dt;
    }

    public Matrik tambah(Matrik x) { 
        Matrik y = null;
        if ((this.nBaris == x.getNBaris()) && (this.nKolom == x.getNKolom())) {
            y = new Matrik(x.getNBaris(), x.getNKolom());
            for (int i = 0; i < this.nBaris; i++) {
                for (int j = 0; j < this.nKolom; j++) {
       y.setItem(i, j, this.itemDt[i][j] + x.getItem(i, j)); 
                }
            }
        }
        return y; 
    }

    public void cetak(String kom) {
        System.out.println(kom);
        for (int i = 0; i < this.nBaris; i++) { 
            for (int j = 0; j < this.nKolom; j++) {
                System.out.print(this.itemDt[i][j] + " "); 
            }
            System.out.println();
        }
    }

     public Larik getBaris(int idBaris){
		Larik r = new Larik(this.nKolom);
		for (int i=0; i<this.nKolom; i++){
		double itemBaris = this.getItem(idBaris, i); 
			r.isiItem(i, (int) itemBaris);
		}
		return r;
	}               

     public  Larik getKolom(int idKolom){
		Larik l = new Larik(this.nBaris);
		for (int i=0; i<this.nBaris; i++){
	double itemKolom = this.getItem(i, idKolom); 
			l.isiItem(i, (int) itemKolom);
		}
		return l;
	}

	public Matrik tranposeMatrik(){
             Matrik hasil= new Matrik (nBaris, nKolom); 
             for(int i=0; i<nKolom; i++){
                for(int j=0; j<nBaris; j++){
                hasil.itemDt[i][j] = itemDt[j][i]; 
            }
        }
        return hasil;
	}
        
     public Matrik kali(Matrik m){
        Matrik hasil = null;
        if ((this.nBaris == m.getNBaris())&& (this.nKolom == m.getNKolom())) {
            hasil = new Matrik(m.getNBaris(), m.getNKolom());
            for (int i = 0; i < this.nBaris; i++) {
                for (int j = 0; j < this.nKolom; j++) { 
                    int temp=0;
                    for(int k=0; k< nKolom;k++){
                      temp += itemDt[i][k] * m.getItem(k, j); 
                    }
                    hasil.setItem(i, j, temp);
                }
            }
        }
        return hasil;        
    }
        
      public double [][] toDArray(){
            double hasil[][]=new double[nBaris][nKolom];
            for(int i=0;i<itemDt.length;i++){ 
                for(int j=0;j<itemDt[i].length;j++){
                    hasil[i][j]=itemDt[i][j];
                }
            }
            return hasil;
        }
        
        public static void cetak (double [][] a, String b){ 
            System.out.println(b);
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
        }
        
        public static void main(String[] args) {

        Matrik A, B, C, D, E;

        double[][] X = {{1, 2, 3}, {2, 14, 5}, {16, 8, 13}};
        double[][] Y = {{10, 12, 0}, {5, 1, 5}, {3, 1, 10}}; 

        A = new Matrik(X);
        B = new Matrik(Y);

        A.cetak("Matrik A");
        System.out.println();
        B.cetak("Matrik B");
        System.out.println();

        C = A.tambah(B); 
        C.cetak("Matrik C = A + B");
        System.out.println();

        A.tranposeMatrik().cetak("Transpos Matrik A"); 
        System.out.println();

        B.tranposeMatrik().cetak("Transpos Matrik B"); 
        System.out.println();

        C.tranposeMatrik().cetak("Transpos Matrik C");
        System.out.println();

        E = A.kali(B);
        E.cetak("Matrik E = A * B");
        System.out.println();

        double[][] F = E.toDArray();
        Matrik.cetak(F, "F = E to Array"); 
        System.out.println();

        Larik lb = A.getBaris(0);
        lb.cetak("Larik A baris ke 1");
        System.out.println();

        Larik lb2 = B.getBaris(0);
        lb2.cetak("Larik B baris ke 1");
        System.out.println();

        Larik lk = A.getKolom(0);
        lk.cetak("Larik A kolom ke-1");
        System.out.println();

        Larik lk2 = B.getKolom(0);
        lk2.cetak("Larik B kolom ke-1");
    }
}

