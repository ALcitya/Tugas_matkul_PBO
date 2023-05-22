/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W1.nomer2;

/**
 *
 * @author Moch.Ichwan Alif K
 * 22104410063
 */
class motor{
    String  jenis_kendaraan;
    int tahun_dibuat;
    String type;
}

public class kendaraan {
    public static void main(String[] args) {
    motor mio = new motor();
    mio.jenis_kendaraan = "matic";
    mio.tahun_dibuat = 2010;
    mio.type = "mio go";
    
    System.out.println("Kendaraan ini berjenis = "+mio.jenis_kendaraan);
    System.out.println("Kendaraan ini dibuat pada tahun "+mio.tahun_dibuat);
    System.out.println("Kendaraan in bertype = "+mio.type);
    
    motor supra = new motor();
    supra.jenis_kendaraan = "injeksi";
    supra.tahun_dibuat = 2013;
    supra.type = "Supra 125";
    
    System.out.println("Kendaraan ini berjenis = "+supra.jenis_kendaraan);
    System.out.println("Kendaraan ini dibuat pada tahun "+supra.tahun_dibuat);
    System.out.println("Kendaraan in bertype = "+supra.type);
    }
    
}
