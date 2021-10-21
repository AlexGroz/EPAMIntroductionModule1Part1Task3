import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        double fun;

        fun = ((sin(x) + cos(y)) / (cos(x) - sin(y)))*tan(x*y);

        System.out.println(fun);
    }
}
