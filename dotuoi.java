import java.time.LocalDate;
import java.util.Scanner;

public class dotuoi {
    public static void main(String[] args) {
        int nam , tuoi;
        String ten;
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap ten : ");
       ten=sc.nextLine();
       System.out.println("nhap nam : ");
       nam=sc.nextInt();
       tuoi = java.time.Year.now().getValue() - nam;
     if (tuoi<16) {
        System.out.println("Ban " + ten + "o do tuoi vi thanh nien");
        
     } else{
        if(tuoi >= 16 && tuoi < 18) {
        System.out.println("Ban " + ten + "o do tuoi truong thanh");
        }else  System.out.println("Ban " + ten + " da gia");
        
    }



    }
    
}
