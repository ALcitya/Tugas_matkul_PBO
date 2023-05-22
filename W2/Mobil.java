/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W2;

/**
 *
 * @author Moch.Ichwan Alif K
 * 22104410063
 */
public class Mobil {
     String pabrik, type, warna;
     
     public static void main(String[] args) {
        
         Mobil mobil = new Mobil();
         mobil.bergerakMaju();
         mobil.bergerakMundur();
         mobil.parkir();
         mobil.pabrik = "Honda";
         mobil.type = "CRV";
         mobil.warna = "Putih";
         System.out.println(mobil.pabrik+" tipennya "+mobil.type+"warnanya "+mobil.warna);
         
         Mobil mobil2 = new Mobil();
         mobil2.bergerakMaju();
         mobil2.bergerakMundur();
         mobil2.parkir();
         mobil2.pabrik = "Toyota";
         mobil2.type = "Innova";
         mobil2.warna = "Pink";
         System.out.println(mobil2.pabrik+" tipennya "+mobil2.type+" warnanya "+mobil2.warna);
         
    }
     public void bergerakMaju(){
         System.out.println("Mobil bergerak maju");
     }

    private void bergerakMundur() {
        System.out.println("Mobil bergerak mundur");
    }

    public void parkir() {
        System.out.println("Mobil sedang parkir");
    }
}
