package hcf;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number");
        int num1 = scan.nextInt();
        System.out.println("Second number");
        int num2 = scan.nextInt();
         
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        int res;        
         
        do {
            res = b;
            b = a%b;
            a = res;
        } while (b!=0);
        System.out.println("HCF between "+num1+" and "+num2+" is: " + res);        
    }
}
