package Day11_ForLoopCont;

import java.util.Scanner;

public class Homework2 {
    //    Write a code where user is asked to enter a number
//    and check for every number between 0 to that number to see how many number between 0 to
//    that number can be divided to 3 and 5 and sum all those number,
//    Print the result
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int n = scan.nextInt();
        int sum = 0;
        int count = 0;
        System.out.println("number between 0 to " + n);
        System.out.println("The list of number which can divisible 3 and 5 ");
        for (int i = 0; i <= n; i++) {


            if (i % 15 == 0) {
                sum += i;
                System.out.print(" " + i);
            }
        }
        System.out.println("  Sum of the these numbers: " + sum);


    }
}