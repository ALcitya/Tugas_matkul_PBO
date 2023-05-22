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
import java.util.Scanner;
public class prosedural {
    public static void main (String[]args){
        int nilai1, nilai2, hasil;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukkan Nilai pertama = ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai kedua = ");
        nilai2 = input.nextInt();
        
        hasil = nilai1 + nilai2;
        
        System.out.print("Hasil dari "+ nilai1+" dan "+nilai2+" adalah "+hasil+" ");
        
    }
}
