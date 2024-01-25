import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int x , i;
        Scanner sc = new Scanner (System.in);
        System.out.println("x=");
        x = sc.nextInt();
        sc.close();
        if (x%2==0) {
            System.out.println("la so chan");
            
        } else System.out.println("la so le");
    }
    
}
