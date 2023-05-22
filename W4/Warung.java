/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W4;

import java.util.*;

/**
 *
 * @author Moch.Ichwan Alif K
 * 22104410063
 */
public class Warung {
    public String makanan, minuman;
    

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public String getMakanan() {
        return makanan;
    }

    public String getMinuman() {
        return minuman;
    }

   
    public static void main(String[] args) {
        Warung angkringan = new Warung();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan makanan : ");
        angkringan.setMakanan(scanner.nextLine());
        angkringan.getMakanan();
        angkringan.getMinuman();
        System.out.println("Menu makanan disini adalah "+angkringan.getMakanan());
        System.out.println("MEnu minuman disini adalah "+angkringan.getMinuman());
// + merupakan concat operator        
    }
}
