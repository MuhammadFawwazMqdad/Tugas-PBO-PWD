package Tugas_2;

import java.util.Scanner;

public class Sepeda {
    
    private Scanner input = new Scanner(System.in);
    String nama;
    int jarakTempuh = 0;
    
    public void inputNama(){
        
        System.out.print("Masukkan nama sepeda : ");
        nama = input.nextLine();
        System.out.println("Object " + nama + " dibuat, jarak tempuh awal " + jarakTempuh + " KM");
    }
    
    public void maju(){
    
        jarakTempuh += 10;
        System.out.println("Bergerak maju sejauh 10KM");
    }
    
    public void mundur(){
    
        jarakTempuh -= 5;
        System.out.println("Bergerak mundur sejauh 5KM");
    }
    
    public void berhenti(){
        System.out.println("Sepeda " + nama + " berhenti");
        System.out.println("Objek sepeda " + nama + ", Jarak tempuh " + jarakTempuh + " KM");
    }
    
    public void tampilMenu(){
        
        System.out.println("1. Maju");
        System.out.println("2. Mundur");
        System.out.println("3. Berhenti");
        System.out.println("4. Keluar");
        System.out.print("Pilihan : ");
    }
    
    public void runProg(){
        
        inputNama();
        
        int pilihan;
        do{
            tampilMenu();
            pilihan = input.nextInt();
            
            if(pilihan == 1){
                maju();
            }else if(pilihan == 2){
                mundur();
            }else if(pilihan == 3){
                berhenti();
            }else if(pilihan != 4){
                System.out.println("Pilihan tidak valdi!");
            }
        }while(pilihan != 4);
    }
}
