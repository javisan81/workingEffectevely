package mcm;

import java.util.Scanner;

public class Mcd {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = scan.nextInt();
         
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        int res;        
         
        do {
            res = b;
            b = a%b;
            a = res;
        } while (b!=0);
        System.out.println("El M.C.D entre "+num1+" y "+num2+" es: " + res);        
    }
}
