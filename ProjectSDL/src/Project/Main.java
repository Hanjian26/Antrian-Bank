/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;

public class Main {
    /*        PROJECT AKHIR STRUKTUR DATA LINEAR C
    ======================KELOMPOK 3======================
    Nama Kelompok : 
    - HANJIAN LISTANTO              (205314102)                 
    - RAFELLY ALMENDO LEWERISSA     (205314088)
    Program Sistem Antrian Bank    
     */
    public static void main(String[] args) {
        int pilih;
        Scanner keyboard = new Scanner(System.in);
        LinkedList linkedlist = new LinkedList();

        System.out.println("=======================================================");
        System.out.println("\tSelamat Datang Di Bank Bersama Indonesia");
        System.out.println("=======================================================");
        System.out.println("Maksimal Satu Transaksi");
        do {
            System.out.println();

            System.out.println("Silahkan Masukan Kode Transaksi");
            System.out.println("================================");
            System.out.println("Pilih Menu");
            System.out.println("1.Pengambilan Nomor Antri");
            System.out.println("2.Pemanggilan Nomor Antri");
            System.out.println("3.Lihat Daftar Antrian");
            System.out.println("4.Lihat Daftar Selesai");
            System.out.println("5.Keluar");
            System.out.print("Pilihan Kode Transaksi : ");
            pilih = keyboard.nextInt();

            System.out.println("================================");
            //.....Apabila 1 maka akan mengambil nomor antrian
            if (pilih == 1) {
                linkedlist.enqueue();

            } else if (pilih == 2) { //....Apabila 2 maka akan memanggil nomor antrian
                linkedlist.dequeue();
            } else if (pilih == 3) { //....Apabila 3 maka akan melihat daftar pengatri
                linkedlist.view();
            } else if (pilih == 4) { //..... Apabila 4 maka akan melihat daftar pengantri selesai
                linkedlist.viewSelesai();
            } else if (pilih == 5) { //....Menghentikan Program
                System.out.println("Terima Kasih Sudah Melakukan Transaksi");
            } else {
                System.out.println("Kode Transaksi Salah"); //....Apabila input kode transaksi selain 1-4
            }

        } while (pilih != 5);
    }
}
