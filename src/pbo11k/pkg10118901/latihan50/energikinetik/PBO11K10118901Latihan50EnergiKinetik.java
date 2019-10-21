/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan50.energikinetik;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menghtung Energi Kinetik dan Usaha konsep orientasi objek
 */
public class PBO11K10118901Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseBall b = new BaseBall();
        b.setMassa(0.145);
        b.setKecepatan(25);
        b.setKecepatanAwal(0);
        System.out.println("=====Menghitung Energi Kinetik=====");
        System.out.println("Massa bola baseball : " + b.getMassa()+" kg ("+b.getMassa()*1000+" gram)");
        System.out.println("Kecepatan bola baseball : " +b.getKecepatan()+" m/s");
        System.out.println("Energi kinetik : "+b.hitungEnergiKinetik(b.getMassa(), b.getKecepatan())+" joule");
        System.out.println("Usaha pada enegi kinetik : "+ b.hitungUsaha(b.getMassa(), b.getKecepatanAwal(), b.getKecepatan())+" joule");
    }
    
}
