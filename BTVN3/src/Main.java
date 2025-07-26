import java.util.Scanner;
public class Main{
    public static final String Square = "Square";
    public static final String Triangle = "Triangle";
    public static final String Circle = "Circle";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Moi ban nhap loại hinh: Square/Circle/Triangle ");
    String type = sc.nextLine();
    switch(type){
            case Square:
                System.out.println("Moi ban nhap canh hinh vuong: ");
                int a = sc.nextInt();
                System.out.println("Dien tich hinh vuong = "+(a*a));
                break;
        case Triangle:
            System.out.print("Nhap canh day: ");
            double base = sc.nextDouble();
            System.out.print("Nhap chieu cao: ");
            double height = sc.nextDouble();
            System.out.println("Dien tich = " + (0.5 * base * height));
            break;

        case Circle:
            System.out.print("Nhap ban kinh: ");
            double r = sc.nextDouble();
            System.out.println("Dien tich = " + (Math.PI * r * r));
            break;

        default:
            System.out.println("Hinh dang khong ho le!");
    }
    sc.close();
    }
}