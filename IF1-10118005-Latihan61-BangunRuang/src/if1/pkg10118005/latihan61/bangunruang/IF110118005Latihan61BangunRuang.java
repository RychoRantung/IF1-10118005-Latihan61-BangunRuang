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
public class IF110118005Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Hitung Volume Bangun Ruang====\n");
        Basket basket = new Basket();
        basket.setJari(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah " +basket.getJari() + " cm");
        System.out.println("Hasil: Volume = " + basket.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setT(21);
        System.out.println("\nSebuah tabung memiliki jari-jari");
        System.out.println("berukuran " +tabung.getJari() +" cm. Jika tingginya " +tabung.getT()+ " cm");
        System.out.println("Hasil: Volume = " + tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setT(9);
        kerucut.setJari(14);
        System.out.println("\nDiketahui tinggi sebuah kerucut " + kerucut.getT() + " cm");
        System.out.println("Jika jari-jarinya " + kerucut.getJari() + " cm");
        System.out.println("Hasil: Volume = " + kerucut.hitungVolume());
    }
    
}
