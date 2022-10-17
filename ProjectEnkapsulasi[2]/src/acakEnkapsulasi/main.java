package acakEnkapsulasi;

import java.util.Scanner;
/**
 *
 * @author Bryanxcz
 */
public class main {
    private String nama;
    private int nilai = 100;
    private int poin = -5;
    private int a;
    private int b;
    private int c;
    
public void tampilmenu(){
    Scanner ta = new Scanner(System.in);
    System.out.println("SELAMAT DATANG DI GAME TEBAK ANGKA");
    System.out.println("=============================================");
    System.out.print("Silahkan Masukkan Username Anda :");
    nama = ta.nextLine();
    System.out.println("=============================================");
    System.out.println("Anda Masuk Sebagai : "+nama); 
    System.out.println("Anda Mempunyai Point : "+nilai); 
    System.out.println("=============================================");
    System.out.println("Peraturan Dalam Game Ini \n1. Anda Diberi Point sebesar 100 \n2. Jika Anda salah dalam menjawab point akan di kurang sebesar 5 poin \n3. Jika Anda berhasil"
            + "menjawab point akan bertambah sebesar 10 poin");
    System.out.println("=============================================");
    System.out.println("Pilih Mode Yang ingin Anda Mainkan : \n1. Easy \n2. Medium \n3. Advance");
    System.out.println("=============================================");
    System.out.print("Silahkan Masukkan Mode (1-3) : ");
        int level = ta.nextInt();
   
    int a = (int)(Math.random() *10);
  int c = 100;
    System.out.println("--------------------------------------------------");
    System.out.println("   MARI MENEBAK ANGKA 0 - 10 ");
    System.out.println("---------------------------------------------------");
do{
    System.out.println("---------------------------------------------------");
    System.out.println("    MASUKKAN ANGKA YANG ANDA TEBAK!");
    System.out.println("---------------------------------------------------");
    Scanner jawab = new Scanner (System.in);
    int b = jawab.nextInt();

if (c > 0 ){
if ( b == a ){
    System.out.println("Selamat, angka yang anda masukkan BENAR!");
    break;}
else if ( b < a ){
    System.out.println("Maaf, angka yang anda masukkan terlalu KECIL.");}
else if ( b > a ){
    System.out.println("Maaf, angka yang anda masukkan terlalu BESAR.");}

    System.out.println("    Anda Memiliki " + c + " Kesempatan Lagi");
    System.out.println("---------------------------------------------------");
    c -=5;}
else{
    System.out.println("---------------------------------------------------");
    System.out.println("ANDA SALAH! KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + a);
    System.out.println("---------------------------------------------------");
    break;
    }
   }
while ( c >=0 );
}

