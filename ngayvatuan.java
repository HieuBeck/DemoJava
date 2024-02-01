import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ngayvatuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay trong tuan");
        int ngay;
        ngay=sc.nextInt();
        LocalDate date = LocalDate.of(2024, 02, ngay);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        String ngaytrongtuan = date.format(formatter);
        System.out.println("Ngày " + ngay + " là ngày " + ngaytrongtuan);
    }
    
    
}
