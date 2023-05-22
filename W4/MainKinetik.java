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
public class MainKinetik {
    public double masa, kecepatan;

    public double getMasa() {
        return masa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double EK(){
        double hasil = 0.5*masa*Math.pow(kecepatan, 2);
        return hasil;
    }
    
    public static void main(String[] args) {
        MainKinetik ek = new MainKinetik();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan masa : ");
        ek.setMasa(scanner.nextDouble());
        System.out.print("Masukkan  kecepatan :");
        ek.setKecepatan(scanner.nextDouble());
        ek.getMasa();
        ek.getKecepatan();
        System.out.println("Masa adalah : "+ek.getMasa());
        System.out.println("Kecepatan adalah "+ek.getKecepatan());
        System.out.println("hasil adalah "+ek.EK());  
    }
    
    
}
