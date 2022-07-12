package Day8_Scanners;
import java.util.Scanner;
public class ASSIGNMENT01 {
    public static void main(String[] args) {

//  1) Write a code where User is being asked for the first number, second number and third number. Then Compare those number print the maximum number.
        int num1;
        int num2;
        int num3;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        num1= input.nextInt();
        System.out.println("Enter second number");
        num2= input.nextInt();
        System.out.println("Enter third number");
        num3= input.nextInt();


        if (num1>num2 && num1>num3){
            System.out.println(num1+" is a maximim number out of " +num1+","+num2+","+num3);
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2+" is a maximim number out of " +num1+","+num2+","+num3);
        }else{  System.out.println(num3+" is a maximim number out of " +num1+","+num2+","+num3);}
    }
}
