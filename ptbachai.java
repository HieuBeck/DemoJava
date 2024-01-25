import java.util.Scanner;

public class ptbachai {
    public static void main(String[] args) {
        double a , b , c , x1 , x2 , delta ;
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        a=sc.nextDouble();
        System.out.print("b=");
        b=sc.nextDouble();
        System.out.print("c=");
        c=sc.nextDouble();
        delta= Math.pow(b,2) - 4*a*c;
        sc.close();
        if (delta<0) {System.out.println("phuong trinh vo nghiem");
            
        }else if(delta==0){
            x1=x2=-b/(2*a);
            System.out.println("phuong trinh co nghiem kep la "+x1);

        }else {
            x1 = (-b - Math.sqrt(delta)) / (2*a);
            x2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println("phuong trinh co 2 nghiem la ");
            System.out.println("x1=" +x1);
            System.out.println("x2=" +x2);
        }

    }
    
}
