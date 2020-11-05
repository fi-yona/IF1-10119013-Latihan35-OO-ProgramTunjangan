/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */


/* Program ini adalah tentang cara mencari total gaji jika ditambahkan dengan
tunjangan setelah menikah.
*/


package if1.pkg10119013.latihan35.oo.programtunjangan;

import java.util.Scanner;
/**
 *
 * @author Fiona Avila
 */


public class OOProgramTunjangan {

    double persenTunjangan = 0.35, gajiPokok;
    String menikah;
    
    public double hitungTunjangan(){
        double tunjanganMenikah;
        tunjanganMenikah = (menikah.equals("ya")?gajiPokok*persenTunjangan:0);
        return tunjanganMenikah;
    }
    
    public static void main(String[] args) {  
       
       OOProgramTunjangan karyawan = new OOProgramTunjangan();
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("==========Program Tunjangan==========");
       System.out.print("Gaji pokok anda dalam sebulan\t: Rp " );
       karyawan.gajiPokok = scan.nextDouble();
       System.out.print("Status Menikah (ya/tidak)\t: ");
       karyawan.menikah = scan.next();
       
       
       System.out.println();
       System.out.println("======Hasil Perhitungan Gaji Anda======");
       System.out.println("Gaji Pokok\t\t: Rp " + karyawan.gajiPokok);
       double tunjanganMenikah = karyawan.hitungTunjangan();
       System.out.println("Tunjangan\t\t: Rp " + tunjanganMenikah);
       System.out.println("Total gaji\t\t: Rp " + (karyawan.gajiPokok+ tunjanganMenikah));;
    }

}