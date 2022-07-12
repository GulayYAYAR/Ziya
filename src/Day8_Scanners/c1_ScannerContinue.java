package Day8_Scanners;

import java.util.Scanner;

public class c1_ScannerContinue {
    public static void main(String[] args) {
        // We are creating a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the short number");
        // How to Scan the Short Data Type input
        short sh = input.nextShort();
        System.out.println("The Short number is; " +sh);

        System.out.println("Please enter the Integer number");
        // Next integer number entered by User.
        int In = input.nextInt();

        System.out.println("The interger number is; " +In);

        System.out.println("Please enter the Double number");

        //Next Double number entered by Users

        double Do = input.nextDouble();

        System.out.println("This is the double number: "+Do);

        // Next Float number;
        float fl = input.nextFloat();

        // The Strings have 2 ways tio be scanned
        // 1) next() Code will read all  the inputs that can be number or chars, or anything you put in the consul
        // until it sees a space " ";
        // 2) NextLine()


    }
}
