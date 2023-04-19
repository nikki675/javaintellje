import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class method {
    public static void add(int a, int b) {  // if we have void then it is not returnable method
        int diff;
        if (a > b) {
            diff = a - b;
            System.out.println(diff);
        } else {
            diff = b - a;
            System.out.println(diff);
        }

    }

    public static int prod(int a, int b) { // returnable method
        return a * b;
    }

        public static void main (String[]args) throws IOException {  // main method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int p = prod(3, 2);
        System.out.println(p);


    }
}









