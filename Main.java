/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;


import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Main {
    public static void main(String[] args) {
        int pilih;
        String menu;
        boolean running;
        running = false;
        float mean;
        
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Masukkan nama        : ");
        mhs.nama = input.nextLine();
        
        System.out.print("Masukkan nim         : ");
        mhs.nim = input.nextLine();
        
        System.out.print("Masukkan alamat      : ");
        mhs.alamat = input.nextLine();
        
        System.out.print("Masukkan nilai uts   : ");
        mhs.uts = input.nextInt();
        
        System.out.print("Masukkan nilai uas   : ");
        mhs.uas = input.nextInt();
        do{
            System.out.println("Menu");
            System.out.println("1. Lihat Detail");
            System.out.println("2. Edit Data");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1: System.out.println("Masukkan nama        : " + mhs.nama);
                        System.out.println("Masukkan nim         : " + mhs.nim);
                        System.out.println("Masukkan alamat      : " + mhs.alamat);
                        System.out.println("Masukkan jurusan     : Informatika");
                        mean = (mhs.uts+mhs.uas)/2;
                        System.out.println("Masukkan nilai       : " + mean);

                    break;
                case 2: System.out.print("Masukkan nama        : ");
                        mhs.nama = input.nextLine(); input.nextLine();

                        System.out.print("Masukkan nim         : ");
                        mhs.nim = input.nextLine();

                        System.out.print("Masukkan alamat      : ");
                        mhs.alamat = input.nextLine();

                        System.out.print("Masukkan nilai uts   : ");
                        mhs.uts = input.nextInt();

                        System.out.print("Masukkan nilai uas   : ");
                        mhs.uas = input.nextInt();
                    break;
                default: System.out.println("Pilihan tidak tersedia");

            }
            System.out.print("Back to menu? (y/n)");
            menu = input.nextLine(); input.nextLine();
            
            if(menu.equalsIgnoreCase("y")){
                running = true;
            }
                
             
        }while(!running);
            
    }   

}
