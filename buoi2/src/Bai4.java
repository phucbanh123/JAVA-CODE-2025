import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 5 số nguyên:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Các phần tử vừa nhập: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử: " + sum);
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);
    }
}
