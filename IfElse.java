package practice.Test;

import java.util.Scanner;

public class IfElse {
    public static void main(String[]args){
        int a;
        System.out.println("Enter your timing: ");
        Scanner S= new Scanner(System.in);
        a= S.nextInt();
        if (a==29)
            System.out.println("Your Qualified for Nationals in B list");
        else if(a<29)
                System.out.println("Your Qualified for Nationals in A list");
        else
            System.out.println("Your are NOT Qualified");




    }
}
