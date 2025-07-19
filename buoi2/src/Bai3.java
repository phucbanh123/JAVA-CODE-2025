import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so nguyen a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = a / b;
        int du = a % b;
        boolean bangnhau = a == b;
        System.out.println(a + " + " + b + " = " + tong);
        System.out.println(a + " - " + b + " = " + hieu);
        System.out.println(a + " * " + b + " = " + tich);
        System.out.println(a + " / " + b + " = " + thuong);
        System.out.println(a + " % " + b + " = " + du);
        System.out.println(a + " == " + b + "? " + bangnhau);
    }
}