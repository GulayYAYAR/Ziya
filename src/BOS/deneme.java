package BOS;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number: ");
    int num1 = input.nextInt();

System.out.println("Enter Second number: ");
    int num2 = input.nextInt();

System.out.println("Enter Third number: ");
    int num3= input.nextInt();

    int sum = num1 + num2 + num3;
    double avarage= (num1 + num2 + num3) / 3;

System.out.println("Sum of numbers is "+ sum);
System.out.println("Avarage of numbers is "+avarage);


    }
}
