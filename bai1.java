import java.util.Scanner;

public class bai1 {
public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.print("a=");
    a=sc.nextInt();
    System.out.print("b=");
    b=sc.nextInt();
    sc.close();
    System.out.println("tong la"+ (a+b));
    System.out.println("hieu la"+ (a-b));
    System.out.println("tich la"+ (a*b));
    System.out.println("tong la"+ (a/b));
    System.out.println("phan du khi chia la"+ (a%b));
}
    

}
