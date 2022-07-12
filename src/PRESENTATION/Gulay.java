package PRESENTATION;


import java.util.Scanner;

public class Gulay {
    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter first person Full name:");
//        String name1=input.nextLine();
//        System.out.println("Enter second person Full name ;");
//        String name2=input.next();
//
//        System.out.println("First person name: "+ name1);
//        System.out.println("Second person name:"+name2);
/*
SCANNER METHODS TO TAKE INPUT
    Method	                       Description
    nextInt()	           reads an int value from the user
    nextFloat()	           reads a float value form the user
    nextBoolean()	       reads a boolean value from the user
    nextLine()	           reads a line of text from the user
    next()	               reads a word from the user
    nextByte()	           reads a byte value from the user
    nextDouble()	       reads a double value from the user
    nextShort()	           reads a short value from the user
    nextLong()	           reads a long value from the user
*/
        //OUESTION 1:  Give C and find F     Formula: F =(9/5)*C +32

        Scanner scan1= new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius:");
double celsius=scan1.nextDouble();
double fahren;
fahren=(9.0/ 5.0)*celsius +32;
        System.out.println("Temperature is in Fahrenheit :"+fahren);
    }}