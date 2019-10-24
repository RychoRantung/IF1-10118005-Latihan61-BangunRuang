/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan61.bangunruang;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Program untuk menghitung volume bola basket, tabung dan kerucut menggunakan konsep abstraksi
 */
public class Basket extends BangunRuang {
    private int jari;
    private final double phi = 3.14;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    public double getPhi(){
        return phi;
    }

    @Override
    public double hitungVolume() {
        return (4*phi*jari*jari*jari) / 3;  
                 //To change body of generated methods, choose Tools | Templates.
    }
    
}

