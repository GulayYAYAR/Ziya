package Day8_Scanners;

import java.util.Scanner;

public class ASSIGNMENT03 {
    public static void main(String[] args) {

//  3) Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product. Then Calculate he revenue based on giving information (hint: Revenue = quantity x price)
        //CALCULATING REVENEU
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter The Quantity");
        int quantity=input.nextInt();

        System.out.println("Please Enter The Price of Each Item");
        double price= input.nextDouble();
        double revenue=quantity*price;
        System.out.println("The revenue is: " +revenue);
    }
}
