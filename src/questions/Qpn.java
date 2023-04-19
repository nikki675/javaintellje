package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Qpn {
    public static void main(String[] args) throws IOException {
        int count= 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br.readLine());
       for (int i=1; i<=num; i++){
            if (num%i==0){
                count=count+1;}}
       if(count==2){
                System.out.println("it is a prime no.");}
            else{
           System.out.println("it is not a prime no.");

                }
            }

        }



