package Day11_ForLoopCont;

import java.util.Scanner;

public class Homework3 {
    //    Write a code where user is asked to enter a number.
//    Find the sum of all the even numbers between 0 to that number (included)
//    Find the sum of all the odd numbers between 0 to that number (included)
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int n = scan.nextInt();
        System.out.println("Numbers between 0 to " + n);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(+i + " is Even---");
                sum1 += i;
            } else {
                sum2 += i;
                System.out.println(+i + " is Odd");
            }

        }
        System.out.println("Sum of the even numbers: " + sum1);
        System.out.println("Sum of the odd numbers:  " + sum2);


    }
}

