package Day8_Scanners;

import java.util.Scanner;

public class ASSIGNMENT05 {
    public static void main(String[] args) {
        //  5) Write a program where User is being asked to enter the first name, and last name and print the full name on the console based on given information.
String str1;
String str2;
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        str1= input.next();
        System.out.println("Please Enter Your Lastname");
        str2= input.next();

        System.out.println("The person's full name: "+str1+ " "+str2);
    }
}
