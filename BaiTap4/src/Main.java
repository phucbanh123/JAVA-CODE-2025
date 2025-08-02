
import java.util.Scanner;

public class Main {
    public static Student[] s = new Student[5];
    public static Scanner sc = new Scanner(System.in);

    public static void nhapThongTin() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Nhap ten hoc sinh: ");
            String name = sc.nextLine();
            System.out.print("Nam sinh: ");
            int born = sc.nextInt();
            sc.nextLine();
            System.out.print("Dia chi: ");
            String address = sc.nextLine();
            System.out.print("Diem TX1: ");
            double tx1 = sc.nextDouble();
            System.out.print("Diem TX2: ");
            double tx2 = sc.nextDouble();
            System.out.print("Diem KTHP: ");
            double kthp = sc.nextDouble();
            System.out.print("So tiet nghi: ");
            int rest = sc.nextInt();
            sc.nextLine();
            s[i] = new Student(name, born, address, tx1, tx2, kthp, rest);
        }
    }
    public static void theoTuoi() {
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].Age() < s[i + 1].Age()) {
                Student tmp = new Student();
                tmp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = tmp;
            }
        }
    }
    public static void theoGPA() {
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].GPA() < s[i + 1].GPA()) {
                Student tmp = new Student();
                tmp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = tmp;
            }
        }

    }
    public static void theoSoTietNghi() {
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].Vang < s[i + 1].Vang) {
                Student tmp = new Student();
                tmp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = tmp;
            }
        }

    }
    public static void inDanhSach() {
        System.out.println();
        System.out.printf("%-20s %-5s %-15s %-5s %-5s %-5s %-5s %-3s", "Ten", "Tuoi", "Dia chi", "TX1", "TX2", "KTHP", "GPA", "So tiet nghi");
        System.out.println();

        for (int i = 0; i < s.length; i++) {
            s[i].List();
        }
    }
    public static void menu() {
        int choose;

        do {
            System.out.println("___________MENU__________");
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Sap xep sinh vien theo tuoi");
            System.out.println("4. Sap xep sinh vien theo GPA");
            System.out.println("5. Sap xep sinh vien theo So tiet nghi");
            System.out.println("6. Xoa sinh vien khoi danh sach");
            System.out.print("Chon thao tac(0 to Quit): ");
            choose = sc.nextInt();
            if (choose == 1) addStudent();
            if (choose == 2) fixStudent();
            if (choose == 3) {
                theoTuoi();
                inDanhSach();
            }
            if (choose == 4) {
                theoGPA();
                inDanhSach();
            }
            if (choose == 5) {
                theoSoTietNghi();
                inDanhSach();
            }
            if (choose == 6) deleteStudent();

        } while (choose > 0);
    }
    public static void addStudent() {
        sc.nextLine();
        System.out.print("Nhap ten hoc sinh: ");
        String name = sc.nextLine();
        System.out.print("Nam sinh: ");
        int born = sc.nextInt();
        sc.nextLine();
        System.out.print("Dia chi: ");
        String address = sc.nextLine();
        System.out.print("Diem TX1: ");
        double tx1 = sc.nextDouble();
        System.out.print("Diem TX2: ");
        double tx2 = sc.nextDouble();
        System.out.print("Diem KTHP: ");
        double kthp = sc.nextDouble();
        System.out.print("So tiet nghi: ");
        int rest = sc.nextInt();
        sc.nextLine();
        Student newStudent = new Student(name, born, address, tx1, tx2, kthp, rest);
        Student[] sNew = new Student[s.length + 1];
        for (int i = 0; i < s.length; i++) {
            sNew[i] = s[i];
        }
        sNew[s.length] = newStudent;
        s = sNew;
        System.out.println("Them sinh vien thanh cong!!!");
    }
    public static void deleteStudent() {
        sc.nextLine();
        System.out.print("Ban muon xoa sinh vien ten la: ");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(!name.equals(s[i].name))
                count++;
        }
        if (count == s.length) {
            System.out.println("Khong tim thay sinh vien '" + name +"' ");
            return;
        }
        Student[] sNew = new Student[s.length - 1];
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (!name.equals(s[i].name)) {
                sNew[j++] = s[i];
            }
        }
        s = sNew;
        System.out.println("Xoa sinh vien thanh cong!");
    }
    public static void fixStudent() {
        sc.nextLine();
        System.out.print("ban muon sua thong tin cua ai? ");
        String name = sc.nextLine();

        for (int i = 0; i < s.length; i++) {
            if (name.equals(s[i].name)) {
                System.out.print("Sua thong tin nao (ten / nam sinh / dia chi / tx1 / tx2 / kthp / so tiet nghi): ");
                String what = sc.nextLine();
                if (what.equals("ten")) {
                    System.out.print(s[i].name);
                    System.out.print(" ---> " );
                    String newName = sc.nextLine();
                    s[i].setName(newName);
                } else if (what.equals("nam sinh")) {
                    System.out.print(s[i].born);
                    System.out.print(" ---> " );
                    int newBorn = sc.nextInt();
                    s[i].setBorn(newBorn);
                } else if (what.equals("dia chi")) {
                    System.out.print(s[i].address);
                    System.out.print(" ---> " );
                    String newAddress = sc.nextLine();
                    s[i].setAddress(newAddress);
                } else if (what.equals("tx1")) {
                    System.out.print(s[i].tx1);
                    System.out.print(" ---> " );
                    double newTx1 = sc.nextDouble();
                    s[i].setTx1(newTx1);
                } else if (what.equals("tx2")) {
                    System.out.print(s[i].tx2);
                    System.out.print(" ---> " );
                    double newTx2 = sc.nextDouble();
                    s[i].setTx2(newTx2);
                } else if (what.equals("kthp")) {
                    System.out.print(s[i].kthp);
                    System.out.print(" ---> " );
                    double newKthp = sc.nextDouble();
                    s[i].setKthp(newKthp);
                } else if (what.equals("so tiet nghi")) {
                    System.out.print(s[i].Vang);
                    System.out.print(" ---> " );
                    int newRest = sc.nextInt();
                    s[i].setVang(newRest);
                }
            }
        }
    }
    public static void main(String[] args) {
        nhapThongTin();
        inDanhSach();
        menu();
    }
}
