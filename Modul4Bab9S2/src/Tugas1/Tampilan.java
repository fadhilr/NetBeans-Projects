/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.awt.*;
import java.awt.event.*;
public class Tampilan extends Frame{
    String nilai[]= new String[4];
    Label lbJudul, lbTugas,lbKuis, lbUTS, lbUAS,lbHasil;
    TextField txTugas, txKuis, txUTS, txUAS, txHasil;
    Checkbox cbASD, cbPemlan, cbMatkom, cbProbstat;
    CheckboxGroup cbg;
    TextArea txArea;
    Button btnHasil,btnTampil;
    Object source;
    public Tampilan(){
        setLayout(null);
        lbJudul=new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial",3,14));
        add(lbJudul);
        lbJudul.setBounds(180,30,170,20);
        cbg=new CheckboxGroup();
        cbASD=new Checkbox("ASD",cbg,false);
        this.add(cbASD).setBounds(30, 60,50,20 );
        cbPemlan=new Checkbox("Pemlan",cbg,false);
        this.add(cbPemlan).setBounds(130, 60,60,20 );
        cbMatkom=new Checkbox("Matkomlan",cbg,false);
        this.add(cbMatkom).setBounds(230, 60,80,20 );
        cbProbstat=new Checkbox("Probstat",cbg,false);
        this.add(cbProbstat).setBounds(340, 60,70,20 );
        lbTugas=new Label("Tugas :");
        add(lbTugas);
        lbTugas.setBounds(130, 90, 70, 20);
        lbKuis=new Label("Kuis :");
        add(lbKuis);
        lbKuis.setBounds(130, 120, 70, 20);
        lbUTS=new Label("UTS :");
        add(lbUTS);
        lbUTS.setBounds(130, 150, 70, 20);
        lbUAS=new Label("UAS :");
        add(lbUAS);
        lbUAS.setBounds(130, 180, 70, 20);
        lbHasil=new Label("Hasil :");
        add(lbHasil);
        lbHasil.setBounds(130, 210, 70, 20);
        txTugas=new TextField();
        add(txTugas);
        txTugas.setBounds(230, 90, 100, 20);
        txKuis=new TextField("");
        add(txKuis);
        txKuis.setBounds(230, 120, 100, 20);
        txUTS=new TextField();
        add(txUTS);
        txUTS.setBounds(230, 150, 100, 20);
        txUAS=new TextField();
        add(txUAS);
        txUAS.setBounds(230, 180, 100, 20);
        txHasil=new TextField();
        add(txHasil);
        txHasil.setBounds(230, 210, 100, 20);
        btnHasil=new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(160, 240, 150, 20);
        txArea=new TextArea();
        add(txArea);
        txArea.setBounds(90, 280, 300, 200);
        btnTampil=new Button("Tampilkan nilai semua matkul");
        add(btnTampil);
        btnTampil.setBounds(90, 500, 300, 20);
        cbASD.addItemListener(new mainAction());
        cbPemlan.addItemListener(new mainAction());
        cbMatkom.addItemListener(new mainAction());
        cbProbstat.addItemListener(new mainAction());
        btnHasil.addActionListener(new mainAction());
        btnTampil.addActionListener(new mainAction2());
    }
    class mainAction implements ItemListener, ActionListener{
        public void itemStateChanged(ItemEvent e) {
            txTugas.setText("");
            txKuis.setText("");
            txUTS.setText("");
            txUAS.setText("");
            txHasil.setText("");
            source=e.getItemSelectable();
        }
        public void actionPerformed(ActionEvent e) {
            int x=0;
            SuperKelas[] matkul=new SuperKelas[4];
            ASD asd=new ASD();
            Pemlan pemlan=new Pemlan();
            Matkomlan matkom=new Matkomlan();
            Probstat probstat=new Probstat();
            matkul[0]=asd;
            matkul[1]=pemlan;
            matkul[2]=matkom;
            matkul[3]=probstat;
            if (source==cbASD) {
                x=0;
            } else if (source==cbPemlan) {
                x=1;
            } else if (source==cbMatkom) {
                x=2;
            } else if (source==cbProbstat) {
                x=3;
            }
            matkul[x].setKuis(txKuis.getText().trim());
            matkul[x].setTugas(txTugas.getText().trim());
            matkul[x].setUTS(txUTS.getText().trim());
            matkul[x].setUAS(txUAS.getText().trim());
            txHasil.setText(matkul[x].hitungHasil());
            nilai[x]=matkul[x].hitungHasil();
        }
    }
    class mainAction2 implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                txArea.setText("HASIL NILAI SEMUA MATA KULIAH "
                        + "\n\nPemlan\t\t :"+nilai[0]+""
                        + "\nASD\t\t :"+nilai[1]+""
                        + "\nMatkomlan\t :"+nilai[2]+
                        "\nProbstat \t :"+nilai[3]);
            }
    }
}
