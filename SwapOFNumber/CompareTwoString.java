package SwapOFNumber;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First string:");
        String a = sc.nextLine();
        System.out.print("Enter the second string:");
        String b = sc.nextLine();
        if(a.equals(b)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
