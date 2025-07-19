import java.util.Scanner;
public class Bai6 {
    static class Student{
            String name;
            int age;
            double gpa;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong sinh vien: ");
            int n = sc.nextInt();
            sc.nextLine();
            Student[] st = new Student[n];

            for(int i = 0; i < n; ++i) {
                st[i] = new Student();
                System.out.println("Sinh vien thu " + (i + 1) + "---");
                System.out.print("Ten sinh vien : ");
                st[i].name = sc.nextLine();
                System.out.print("Tuoi : ");
                st[i].age = sc.nextInt();
                System.out.print("GPA : ");
                st[i].gpa = sc.nextDouble();
                sc.nextLine();
                System.out.println();
            }

            System.out.println("--- Danh Sach sinh vien ---");

            for(int i = 0; i < n; ++i) {
                System.out.print("\n-" + (i + 1) + "\n-Ho va ten: " + st[i].name);
                System.out.print("\n    Tuoi: " + st[i].age);
                System.out.print("\n    GPA: " + st[i].gpa);
            }

            double sum = 0;
            for(int k = 0; k < n; ++k) {
                sum += st[k].gpa;
            };

            double avg = sum / n;
            System.out.printf("\nDiem trung binh ca lop: %.2f", avg);
            double max = 0;
            String maxName = null;

            for(int i = 0; i < n; ++i) {
                if (st[i].gpa > max) {
                    max = st[i].gpa;
                    maxName = st[i].name;
                }
            }

            System.out.println("\nSinh vien co diem cao nhat la: " + maxName);
        }

    }
