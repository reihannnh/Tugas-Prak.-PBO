/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Main {
    public static void main(String[] args) {
        char menu;
        int pilih;
        double inputPanjang, inputLebar, inputTinggiBalok, inputRadial, inputTinggiKerucut;
        
        Scanner input = new Scanner(System.in);
        
        PersegiPanjang persegi = new PersegiPanjang(2,4);
        Balok balok = new Balok(2,4,6);
        Lingkaran lingkaran = new Lingkaran(3);
        Kerucut kerucut = new Kerucut(3,5,7);                              
        
        do{
            System.out.println("INPUT");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); 
            pilih = input.nextInt();
            
            switch(pilih){
                case 1: System.out.print("Panjang : "); inputPanjang      = input.nextDouble(); persegi.setPanjang(inputPanjang);
                        System.out.print("Lebar   : "); inputLebar        = input.nextDouble(); persegi.setLebar(inputLebar);
                        System.out.print("Tinggi  : "); inputTinggiBalok  = input.nextDouble(); balok.setTinggi(inputTinggiBalok);
                        System.out.println("________ OUTPUT ________");
                        System.out.println("Balok");
                        System.out.println("Luas Persegi Panjang    : " + persegi.Luas()); 
                        System.out.println("Keliling Persegi Panjang: " + persegi.Keliling());
                        System.out.println("Volume Balok            : " + balok.Volume());
                        System.out.println("Luas Permukaan Balok    : " + balok.LuasPermukaan());
                    break;
                case 2: System.out.print("Jari-Jari   : "); inputRadial           = input.nextDouble(); lingkaran.setRadial(inputRadial);
                        System.out.print("Tinggi      : "); inputTinggiKerucut    = input.nextDouble(); kerucut.setTinggi(inputRadial);
                        System.out.println("________ OUTPUT ________");
                        System.out.println("Kerucut");
                        System.out.println("Luas Lingakran          : " + lingkaran.Luas());
                        System.out.println("Keliling Lingakran      : " + lingkaran.Keliling());
                        System.out.println("Volume Kerucut          : " + kerucut.Volume());
                        System.out.println("Luas Permukaan Kerucut  : " + kerucut.LuasPermukaan());
                    break;
            }
            
            System.out.print("Back to menu? (y/n)");
            menu =  input.next().charAt(0);
        }while(menu=='y'||menu=='Y');
    }
}
