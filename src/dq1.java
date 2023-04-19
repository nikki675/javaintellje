import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dq1 {

    public static void main(String[] args) {
        int i , a = 0, b = 1, c=0 ;
        System.out.println(a);
        for (i = 1; i <= 20; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);

        }
    }
}




















