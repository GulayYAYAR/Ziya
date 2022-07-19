package Day11_ForLoopCont;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        //  Write a code where user is asked to enter an integer number:
//  1) Using the given number find the factorial of that number and Print the result.
// example: 5 ==> 5! = 5*4*3*2*1 = 120

        int n = 1;
        int fact = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            fact =fact * i;
        }
        System.out.println(n +" Factoriel= " +n +"! = " + fact);
    }


}



