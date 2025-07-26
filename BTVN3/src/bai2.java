import java.util.Scanner;

public class bai2 {

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi ki tu bat ki : ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println(str.toUpperCase());
            System.out.println("Chuoi doi xung!");
        }
        else{
            System.out.println(str.toLowerCase());
            System.out.println("Chuoi khong doi xung!");
        }
    }
}
