package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int i, n, sum=0;
        i = Integer.parseInt(br.readLine());
        while (i>0){
            n=i%10;
            sum=sum+n;
            i=i/10;
        }
        System.out.println(" sum of digits:"+sum);

    }
}
