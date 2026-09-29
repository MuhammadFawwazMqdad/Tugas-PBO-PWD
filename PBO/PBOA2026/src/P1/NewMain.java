
package P1;

/**
 *
 * @author Xperia Care
 */
//import java.util.Scanner;

public class NewMain {
    
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        String nama;
//        int umur;
//        
//        System.out.print("Input nama : ");
//        nama = input.nextLine();
//        
//        System.out.println("Selamat datang " + nama);
//        
//        System.out.print("Input umur anda : ");
//        umur = input.nextInt();
//        
//        System.out.println("Umur anda : " + umur);
//        
//        Byte pilihan;
//        
//        System.out.println("Pilihan 1 : Tampil Teks");
//        System.out.println("Pilihan 2 : Tidak tampil");
//        System.out.print("Pilihan : ");
//        pilihan = input.nextByte();
//        
//        
//        String kata;
//        kata = "I found out that Java is like C++ that i have learn before, the variable initiation, the operator, and more than that is more likely C++, becausre of that im asure that Java will be fun and not hard as i thought, maybe that's all the things that i want to share.";
//        
//        if(pilihan == 1){
//            System.out.print(kata);
//        }
        
        //lambda switch
//        var pil = A;
//        switch(pil){
//            case 'A' ->{
//                System.out.println("Sehat");
//                System.out.println("Kuat");
//            }
//            case 'B' , 'C' -> System.out.println("Sehat");
//            case 'D' -> System.out.println("Kurang sehat");
//        }
                
        //array
        int angka[] = new int[3];
        angka[0] = 10;
        angka[1] = 5;
        angka[2] = 1;
        
        String member[][] = {
          
            {"Mister cihuy", "Claire", "Hex"},
            {"George", "Ophelia", "Stardenburdenhardenbart"},
            {"Roman", "Brook"}
            
        };
        
        //variasi looping 1
        for(int i = 0 ; i  <= 3 ; i++){
            
            System.out.println("Angka : " + angka[i]);
            
        }
         
        //variasi looping 2
        int counter = 1;
        for(; counter <= 5 ;){
            System.out.println(counter);
            counter++;
        }
        
        //variasi looping foreach ( khusus array )
        for(var value:angka){
            System.out.println(value);
        }
        
        sayHello();
        
    }//end of main
       
    static void sayHello(){
    
        System.out.println("Selamat datang");
        
    }
    
}//end of class
        
