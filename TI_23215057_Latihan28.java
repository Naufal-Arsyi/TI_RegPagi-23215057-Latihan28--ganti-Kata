/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 *
  * Nama  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini dibuat untuk mengubah kata dalam kalimat
 */
import java.util.Scanner;

public class TI_23215057_Latihan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata : ");
        String kataLama = input.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();

        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimatBaru);
    }
}

