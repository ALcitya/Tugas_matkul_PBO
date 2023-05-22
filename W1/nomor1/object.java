/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W1.nomor1;

/**
 *
 * @author Moch.Ichwan Alif K
 * 22104410063
 */
class Persegi{
    private int panjang;
    private int  lebar;
    
    public Persegi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int hitungLuas(){
        return panjang*lebar;
    }
    public void setPanjang(int panjangPersegi){
        this.panjang = panjangPersegi;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lebarPersegi){
        this.lebar = lebarPersegi;
    }
    public int getLebar(){
        return lebar;
    }
}
public class object {
    public static void main(String[]args){
        Persegi nilai = new Persegi(5,7);
        System.out.println("Panjang persegi = "+nilai.getPanjang());
        System.out.println("Lebar persegi = "+nilai.getLebar());
        System.out.println("Luas Persegi = "+nilai.hitungLuas());
                
        nilai.setLebar(8);
        nilai.setPanjang(12);
        System.out.println("Panjang persegi = "+nilai.getPanjang());
        System.out.println("Lebar persegi = "+nilai.getLebar());
        System.out.println("Luas Persegi = "+nilai.hitungLuas());
        
    }
}
