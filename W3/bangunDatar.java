/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W3;

/**
 *
 * @author Moch.Ichwan Alif K
 * 22104410063
 */
public class bangunDatar {
        int luas;
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bangunDatar persegi = new bangunDatar(3);
        persegi.cetak(3);
        bangunDatar persegiPanjang = new bangunDatar(4,5);
        persegiPanjang.cetak(3,4);
    }

    private bangunDatar(int sisi) {
        luas = sisi*sisi;
        System.out.println("Luas persegi :"+luas);
    }

    private bangunDatar(int panjang, int lebar) {
        luas = panjang*lebar;
           System.out.println("Luas persegi panjang :"+luas);
    }

    private void cetak(int sisi) {
        System.out.println("Persegi sisinya = "+sisi);
    }

    private void cetak(int panjang, int lebar) {
       System.out.println("Persegi Panjang = "+panjang);
    }
}