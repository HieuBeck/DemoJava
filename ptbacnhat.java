import java.util.Scanner;

public class ptbacnhat {

    public static void main(String[] args) {
        double a , b , x ;
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        a = sc.nextDouble();
        System.out.print("b= ");
        b = sc.nextDouble();
        x=-b/a;
        if (a==0) {
            System.out.println("phuong trinh vo nghiem");
            
        }else{
            System.out.println("nghiem cua phuong trinh la "+x);
        }


    }
}