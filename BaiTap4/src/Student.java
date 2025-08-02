
import java.util.Scanner;

public class Student {
    String name;
    int born;
    String address;
    double tx1, tx2, kthp;
    int Vang;

    public Student() {}
    public Student(String name, int born, String address, double tx1, double tx2, double kthp, int Vang) {
        this.name = name;
        this.born = born;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.Vang = Vang;
    }
    public int Age() {
        return 2025 - born;
    }
    public double GPA() {
        return tx1*0.2 + tx2*0.3 + kthp*0.5;
    }
    public void List() {
        System.out.printf("%-20s %-5d %-15s %-5.1f %-5.1f %-5.1f %-5.2f %-3d\n", name, Age(), address, tx1, tx2, kthp, GPA(), Vang);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBorn() {
        return born;
    }
    public void setBorn(int born) {
        this.born = born;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getTx1() {
        return tx1;
    }
    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }
    public double getTx2() {
        return tx2;
    }
    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }
    public double getKthp() {
        return kthp;
    }
    public void setKthp(double kthp) {
        this.kthp = kthp;
    }
    public int getVang() {
        return Vang;
    }
    public void setVang(int Vang) {
        this.Vang = Vang;
    }
}
