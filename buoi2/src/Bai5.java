import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong cua so 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100 (dung for): " + sum);

        int sum1 = 0;
        int j = 1;
        while (j <= 100) {
            if (j % 2 == 0) {
                sum1 += j;
            }
            j++;
        }
        System.out.println("Tong cac so chan tu 1 den 100 (dung while): " + sum1);
    }
}
