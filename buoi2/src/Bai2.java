import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Moi ban nhap ten cua ban: ");
     String name = sc.nextLine();
     System.out.println("Moi ban nhap tuoi cua ban: ");
     int age = sc.nextInt();
     sc.nextLine();
     System.out.println("Lop cua ban la: ");
     String lop = sc.nextLine();
     System.out.println("GPA cua ban la: ");
     float GPA = sc.nextFloat();
     System.out.println("Ten cua ban: "+name+"\nTuoi cua ban: "+age+"\nLop cua ban: "+lop+"\nGPA cua ban: "+GPA);
    }
}
