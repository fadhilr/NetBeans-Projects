package latihan;
import java.util.Scanner;
public class LatihanFungsi1 {
    public static void main(String[] args) {
        Scanner moco = new Scanner(System.in);
        Scanner moco2= new Scanner(System.in);
//____________________________________________I__N__P__U__T_____________________________________________________________//
        System.out.print("NIM           : ");
        String nim  = moco.nextLine();
        System.out.print("Nama          : ");
        String nama = moco.nextLine();

        System.out.println("");

        System.out.print("Mata Kuliah 1 : ");
        String  matkul1 = moco.nextLine();
        int    pmatkul1 = matkul1.length();
        System.out.print("Jumlah SKS    : ");
        int        sks1 = moco.nextInt();
        System.out.print("Nilai         : ");
        double   nilai1 = moco.nextDouble();
        
        System.out.println("");

        System.out.print("Mata Kuliah 2 : ");
        String  matkul2 = moco2.nextLine();
        int    pmatkul2 = matkul2.length();
        System.out.print("Jumlah SKS    : ");
        int        sks2 = moco.nextInt();
        System.out.print("Nilai         : ");
        double   nilai2 = moco.nextDouble();

        System.out.println("");

        System.out.print("Mata Kuliah 3 : ");
        String matkul3 = moco2.nextLine();
        int   pmatkul3 = matkul3.length();
        System.out.print("Jumlah SKS    : ");
        int       sks3 = moco.nextInt();
        System.out.print("Nilai         : ");
        double  nilai3 = moco.nextDouble();

        System.out.println("");

        System.out.print("Mata Kuliah 4 : ");
        String matkul4 = moco2.nextLine();
        int   pmatkul4 = matkul4.length();
        System.out.print("Jumlah SKS    : ");
        int       sks4 = moco.nextInt();
        System.out.print("Nilai         : ");
        double  nilai4 = moco.nextDouble();
        
        System.out.println("");
//____________________________________________O__U__T__P__U__T__________________________________________________________//
        
        System.out.println("Tabel         : ");
        System.out.println("╔═══════════════╦═══╦═════════╦══════╦════════════╗");
        System.out.println("║       Mata Kuliah       ║ SKS ║  Nilai Huruf  ║   Bobot  ║ Total(SKS x Bobot) ║");
        System.out.println("╠═══════════════╬═══╬═════════╬══════╬════════════╣");
        tampilan(matkul1, pmatkul1, sks1, nilai1);
        tampilan(matkul2, pmatkul2, sks2, nilai2);
        tampilan(matkul3, pmatkul3, sks3, nilai3);
        tampilan(matkul4, pmatkul4, sks4, nilai4);
        System.out.println("╠═══════════════╬═══╬═════════╩══════╬════════════╣");
        System.out.print  ("║         Jumlah          ║ ");if((sks1+sks2+sks3+sks4)>9){System.out.print((sks1+sks2+sks3+sks4));}else{System.out.print(" "+(sks1+sks2+sks3+sks4));}
        System.out.print  ("  ║                           ║        "+jumlahTotal(sks1, sks2, sks3, sks4, nilai1, nilai2, nilai3, nilai4));
        System.out.println("        ║");
        System.out.println("╚═══════════════╩═══╩════════════════╩════════════╝");
        
        System.out.printf ("Index Prestasi Semeseter        : %.2f%n",ipk(sks1, sks2, sks3, sks4, nilai1, nilai2, nilai3, nilai4));
    }

    static String nilaiHuruf(double x) {
        if (x >= 80 & x <= 100) {
            return "A";
        } else if (x >= 75 & x <= 80) {
            return "B+";
        } else if (x >= 69 & x <= 75) {
            return "B";
        } else if (x >= 60 & x <= 69) {
            return "C+";
        } else if (x >= 55 & x <= 60) {
            return "C";
        } else if (x >= 50 & x <= 55) {
            return "D+";
        } else if (x >= 44 & x <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    static double bobot(String x) {
        if (x == "A") {
            return 4;
        } else if (x == "B+") {
            return 3.5;
        } else if (x == "B") {
            return 3;
        } else if (x == "C+") {
            return 2.5;
        } else if (x == "C") {
            return 2;
        } else if (x == "D+") {
            return 1.5;
        } else if (x == "D") {
            return 1;
        } else {
            return 0;
        }
    }
    
    static double total(int sks, double nilai){
        return sks*bobot(nilaiHuruf(nilai));
    }
    
    static double jumlahTotal(int a, int c, int e, int g, double b, double d, double f, double h){
        return total(a, b)+total(c, d)+total(e, f)+total(g, h);
    }

    static double ipk(int a, int c, int e, int g, double b, double d, double f, double h) {
        double totalNilai = jumlahTotal(a, c, e, g, b, d, f, h);
        double totalSKS   = a+c+e+g;
        return totalNilai/totalSKS;
    }
    
    static void   tampilan(String matkul, int pmatkul, int sks, double nilai){
        System.out.print  ("║ "+matkul); for(int a=1;a<=(24-pmatkul);a++){System.out.print(" ");}
        System.out.print  (                          "║  "+sks+"  ║       "+nilaiHuruf(nilai)); 
        
        if(nilaiHuruf(nilai).length()==1) {System.out.print(" ");}
        else                              {System.out.print("");}
        
        if(sks*bobot(nilaiHuruf(nilai))>9){System.out.println("      ║   "+bobot(nilaiHuruf(nilai))+"    ║        " +total(sks, nilai)+"        ║");}
        else                              {System.out.println("      ║   "+bobot(nilaiHuruf(nilai))+"    ║         "+total(sks, nilai)+"        ║");}
    }
}
