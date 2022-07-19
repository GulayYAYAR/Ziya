package Day11_ForLoopCont;

import java.util.Scanner;

public class Homework5 {
    //    Write a code where user is asked to enter a number:
//    Calculate the square of all the numbers from 0 to given number and print the result for each number,
//    (square of a number is number*number == > 5*5 = 25 or 6*6 = 36
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int n = scan.nextInt();
        int sqr;
        System.out.println("Numbers:");
        for (int i = 0; i <= n; i++) {
            System.out.print("  " + i);
        }
        System.out.println("  Square of each number: ");
        for (int i = 0; i <= n; i++) {
            sqr = i * i;

            System.out.print("  " + sqr);
        }


    }
}
