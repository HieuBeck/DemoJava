import java.util.Scanner;

public class songuyen{
    public static void main(String[] args) {
        int   s=0 , i , n;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong bat ky: ");
            n=sc.nextInt();
           
        while (n>0) {
            i=n%10;
            n=n/10;
            s+=i;
        }


        System.out.println("Tong cac chu so = " + s);
    }
}
