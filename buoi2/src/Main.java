import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban nhap ten cua ban: ");
            String name = sc.nextLine();
            System.out.println("Tuoi cua ban: ");
            int age = sc.nextInt();
            System.out.println("Chieu cao cua ban: ");
            int high = sc.nextInt();
            System.out.println("Ten cua ban la: "+name+"\nTuoi cua ban la: "+age+"\nChieu cao cua ban la: "+high);

        }
    }