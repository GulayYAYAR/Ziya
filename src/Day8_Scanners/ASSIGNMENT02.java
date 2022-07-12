package Day8_Scanners;

import java.util.Scanner;

public class ASSIGNMENT02 {
    public static void main(String[] args) {

        //  2) Write a code where user is being asked to enter a number and based on the entered number print the number is positive, negative or zero
        int num;
          Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
          num= input.nextInt();

          if (num>0){
              System.out.println(num+" is a positive number.");}
          else if (num<0) {
              System.out.println(num+" is a negative number.");}
          else { System.out.println(num+" is zero.");}
          }

    }

