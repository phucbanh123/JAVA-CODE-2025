import java.sql.SQLOutput;

public class hamPt{
    public static void main(String[] args) {
        double x = 3.2;
        double y = 4.4;
        double mu = Math.pow(x,y);
        double can = Math.sqrt(y);
        double gT = Math.abs(x);
        double round = Math.round(x);
        double ceil = Math.ceil(y);
        double floor = Math.floor(x);
        double angle = Math.toRadians(90);
        double sin = Math.sin(angle);
        double value = 5.0;
        double log10 = Math.log10(value);
        double log = Math.log(value);
        double exp = Math.exp(value);

        System.out.println("x^y = " + mu);
        System.out.println("√y = " + can);
        System.out.println("|x| = " + gT);
        System.out.println("round(x) = " + round);
        System.out.println("ceil(y) = " + ceil);
        System.out.println("floor(x) = " + floor);
        System.out.println("90° sang radian = " + angle);
        System.out.println("sin(90°) = " + sin);
        System.out.println("log10 = "+ log10);
        System.out.println("log = "+ log);
        System.out.println("exp = "+ exp);
    }
}