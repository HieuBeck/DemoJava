import java.util.Scanner;

public class tongcacso {
    public static void main(String[] args) {
        int s=0;
        do{
            int n ;
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap so nguyen :");
            n=sc.nextInt();
            s+=n;

        } while(s<100);
        System.out.println("tong cac so la " +s);
    }
    
}
