/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanUap2;

import java.awt.*;
import java.awt.event.*;

public class Frame_Latihan extends Frame {
    int a,b,c;
    Label lbJudul,lbS1, lbS2, lbS3;
    TextField txtS1, txtS2, txtS3;
    String Pemilihan, Suara1 = "",Suara2 = "", Suara3 = "";
    TextArea txtArea;
    Button btnS1,btnS2,btnS3, btnSelesai;
    
    public Frame_Latihan() {

        setLayout(null);
        lbJudul = new Label("Perhitungan Suara");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(120, 30, 170, 20);
        
        lbS1 = new Label("Calon 1 : ");
        add(lbS1);
        lbS1.setBounds(120, 90, 62, 20);
        lbS2 = new Label("Calon 2 : ");
        add(lbS2);
        lbS2.setBounds(120, 120, 70, 20);
        lbS3 = new Label("Calon 3 : ");
        add(lbS3);
        lbS3.setBounds(120, 150, 70, 20);
        
        txtS1 = new TextField("0");
        add(txtS1);
        txtS1.setBounds(210, 90, 60, 20);
        txtS2 = new TextField("0");
        add(txtS2);
        txtS2.setBounds(210, 120, 60, 20);
        txtS3 = new TextField("0");
        add(txtS3);
        txtS3.setBounds(210, 150, 60, 20);
        
        
        btnS1 = new Button("Tambah");
        add(btnS1);
        btnS1.setBounds(280, 90, 50, 20);
        btnS1.addActionListener(new Hitung1());
        btnS2 = new Button("Tambah");
        add(btnS2);
        btnS2.setBounds(280, 120, 50, 20);
        btnS2.addActionListener(new Hitung2());
        btnS3 = new Button("Tambah");
        add(btnS3);
        btnS3.setBounds(280, 150, 50, 20);
        btnS3.addActionListener(new Hitung3());
        txtArea = new TextArea();
        this.add(txtArea);
        txtArea.setBounds(75, 275, 250, 200);
        btnSelesai = new Button("Selesai");
        add(btnSelesai);
        btnSelesai.setBounds(75, 495, 250, 20);
        btnSelesai.addActionListener(new TeksArea());
    }
    class Hitung1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(txtS1.getText());
            a++;
            txtS1.setText(String.valueOf(a));
            Suara1 = txtS1.getText();
        }
    }
    class Hitung2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            b = Integer.parseInt(txtS2.getText());
            b++;
            txtS2.setText(String.valueOf(b));
            Suara2 = txtS2.getText();
        }
    }
    class Hitung3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            c = Integer.parseInt(txtS3.getText());
            c++;
            txtS3.setText(String.valueOf(c));
            Suara3 = txtS3.getText();
        }
    }
    class TeksArea implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String pemenang="";
            if (a>b&&a>c) {
                pemenang="Calon 1";
            } else if (b>a&&b>c) {
                pemenang="Calon 2";
            } else if (c>a&&c>b) {
                pemenang="Calon 3";
            }
            String tampil = "HASIL PERHITUNGAN\n"
                    + "\nSuara 1\t: " + Suara1 + "\nSuara 2\t: " + Suara2
                    + "\nSuara 3\t: " + Suara3 +"\nPemenangnya adalah \t: "+pemenang;
            txtArea.setFont(new Font("Arial", 0, 14));
            txtArea.setText(tampil);
            txtArea.setEditable(false);
        }
    }
}
