
package tugas.pkg1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int xx = 1;
        do{
            int pilihan;
            System.out.println("Pilihan : ");
            System.out.println("1. Input Tahun");
            System.out.println("2. Keluar");
            System.out.print("Input : ");
            pilihan = input.nextByte();
            if(pilihan == 1){
               int tahun;
                System.out.print("Masukkan tahun ( 1909 - 2024 ) : ");
                tahun = input.nextInt();
        
                if(tahun % 4 == 0){
                    System.out.print(tahun + " Adalah tahun kabisat");
                }else {
                    System.out.print(tahun + " Bukan tahun kabisat");
                }
            }else if (pilihan == 2){
                xx = 2;
            }
        }while(xx == 1);
    }
    
}
