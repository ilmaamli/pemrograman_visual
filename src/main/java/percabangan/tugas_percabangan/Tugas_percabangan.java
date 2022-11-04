/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package percabangan.tugas_percabangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tugas_percabangan {

    public static void main(String[] args) {
        // deklarasi variabel
        int angka;
        
        //scanner
        Scanner i = new Scanner (System.in);
        System.out.print("Masukan Angka : ");
        
        //struktur kondisi if
        if (i.hasNextInt()){
           angka = i.nextInt();
            if (angka < 6){
                System.out.println("Angka harus lebih dari 6");
            } else if (angka > 100){
                System.out.println("Angka harus kurang dari 100");
            } else if (angka%2==0){
                System.out.println("Anda Menginput Bilangan Genap");
            } else {
                System.out.println("Anda Menginputkan Bilangan Ganjil");
            }
        }else{
              System.out.println("Anda harus menginputkan angka");  
            }
    }
}
