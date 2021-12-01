/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;

public class DataNasabah {

    public int id;
    public String nama;


    public DataNasabah next;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    //....Format //  2021/03/22 16:37:15
    DateTimeFormatter tglPendaftaran = DateTimeFormatter.ofPattern("uuuu/MM/dd");
    LocalDateTime daftar = LocalDateTime.now();

    //....Format JAM 16:37:15
    DateTimeFormatter waktuPemanggilan = DateTimeFormatter.ofPattern("uuuu/MM/dd");
    LocalTime localTime = LocalTime.now();

    //.....Input untuk memasukan ID, nama, dan keperluan
    int banyakNasabah = 0;

    public void input() {
        System.out.println();
        System.out.println("=================================");
        System.out.print("Masukan ID            : ");
        id = in.nextInt();
        System.out.print("Masukan Nama          : ");
        nama = str.nextLine();
        System.out.println("=================================");
        next = null;
        banyakNasabah++;
    }

    LinkedList ll = new LinkedList();

    //.....Menampilkan ID, Nama dan keperluan pengantri
    public void readPengantri() {
        System.out.println(id + "\t \t " + nama + "\t \t" + (tglPendaftaran.format(daftar)));
    }

    //.....Belum FIX
    public void readSelesai() {
        System.out.println(id + "\t \t " + nama + "\t \t" + (tglPendaftaran.format(daftar)) 
                + "\t \t " + waktuPemanggilan.format(localTime));

    }
}
