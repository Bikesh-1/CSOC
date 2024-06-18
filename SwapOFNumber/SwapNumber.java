package SwapOFNumber;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Befor Swapping the number:" +a+" "+b);
        int provi;
        provi = a;
        a=b;
        b=provi;
        System.out.println("after Swapping the number:" +a+" "+b);
    }
}
