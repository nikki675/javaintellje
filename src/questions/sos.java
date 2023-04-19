package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sos {
    public static void main(String[] args) {
        int sum = 0;
        int prod = 1;
        for (int i = 1; i <= 5; i++) {
            prod = prod * i;
            sum = sum + prod;
        }
        System.out.println(sum);
    }
}
