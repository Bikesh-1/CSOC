package SwapOFNumber;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix:");
        int n[][]=new int[2][2];
        for(int i =0; i<2;i++){
            for(int j =0; j<2;j++){
                n[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is ");
        for(int i =0; i<2;i++){
            for(int j =0; j<2;j++){
                System.out.println(n[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
