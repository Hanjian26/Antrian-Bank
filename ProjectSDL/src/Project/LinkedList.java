package Project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Hanjian Listanto
 */
public class LinkedList {

    public DataNasabah head, tail;
    public String nama;
    public int id;

    public LinkedList() {
        head = null;
        tail = null;
    }

    //......Method untuk mengambil nomor antrian
    public void enqueue() {

        DataNasabah dNasabah = new DataNasabah();
        dNasabah.input();
        if (head == null) {
            head = dNasabah;
        } else {
            tail.next = dNasabah;
        }
        tail = dNasabah;
    }

    //......Method untuk memanggil nomor antrian
    public void dequeue() {
        DateTimeFormatter waktuPemanggilan = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        if (head == null) {

            System.out.println("Antrian Telah Habis/Kosong");
        } else {

            System.out.println("Pemanggilan Nomor Antri dengan ID " + head.id + " "
                    + "atas Nama " + head.nama + " pada Jam " + localTime.format(waktuPemanggilan));
            keperluan();
            //.....Pengantrian Selesai
        }

    }
    String keperluan;

    public void keperluan() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Keperluan : ");
        keperluan = keyboard.next();

        if (keperluan.equalsIgnoreCase("Transfer")) {
            DateTimeFormatter waktuSelesai = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime local = LocalTime.now();
            System.out.println("Nomor Antri Dengan ID " + head.id + " Atas Nama "
                    + head.nama + " Selesai Terlayani pada jam " + local.format(waktuSelesai));
            head = head.next;
        } else if (keperluan.equalsIgnoreCase("Deposit")) {
            DateTimeFormatter waktuSelesai = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime local = LocalTime.now();
            System.out.println("Nomor Antri Dengan ID " + head.id + " Atas Nama "
                    + head.nama + " Selesai Terlayani pada jam " + local.format(waktuSelesai));
            head = head.next;
        } else if (keperluan.equalsIgnoreCase("TarikTunai")) {
            DateTimeFormatter waktuSelesai = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime local = LocalTime.now();
            System.out.println("Nomor Antri Dengan ID " + head.id + " Atas Nama "
                    + head.nama + " Selesai Terlayani pada jam " + local.format(waktuSelesai));
            //....Pengantri selanjutnya
            head = head.next;
        } else {
            System.out.println("Keperluan Anda Tidak Tersedia");
            keperluan();
        }

    }

    //.....Method untuk menampilkan Data Data Antrian
    public void view() {
        if (head == null) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("===============================================================================================");
            System.out.println("ID  \t \t Nama  \t \tTangggal Pendaftaran");
            System.out.println("===============================================================================================");
            //.....Data Antrian Yang Terdaftar
            for (DataNasabah a = head; a != null; a = a.next) {
                a.readPengantri();
            }

            System.out.println("===============================================================================================");

        }
    }

    public void viewSelesai() {
        DateTimeFormatter waktuPemanggilan = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTimeSls = LocalDateTime.now().toLocalTime();

        System.out.println("=========================================================");
        System.out.println("ID  \t Nama  \t \tKeperluan \tTangggal Pendaftaran");
        System.out.println("=========================================================");

        DateTimeFormatter tglPendaftaran = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDateTime daftar = LocalDateTime.now();
        DataNasabah data = new DataNasabah();

        System.out.println("0001 \t Hanjian \t Transfer    \t " + tglPendaftaran.format(daftar));
        System.out.println("0002 \t Rafelly \t Deposit     \t " + tglPendaftaran.format(daftar));
        System.out.println("0003 \t Andikaa \t Tarik Tunai \t " + tglPendaftaran.format(daftar));
        System.out.println("0004 \t Dendiii \t Tarik Tunai \t " + tglPendaftaran.format(daftar));

    }
}
