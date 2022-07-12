package Day8_Scanners;
import java.util.Scanner;
public class ASSIGNMENT04 {
    public static void main(String[] args) {  //CREATE A CALCULATOR
            Scanner input = new Scanner(System.in);
            double num1;
            double num2;
            int operator;
            String result;

            System.out.println("Please enter the first Number: ");
            num1 = input.nextInt();
            System.out.println("Please enter the second Number: ");
            num2 = input.nextInt();
            System.out.println("Please select a6n operation \n1 for Multiplication \n2 for Division \n3 for Addition \n4 for subtraction \n5 for mod");
            operator = input.nextInt();

            if(operator == 1){
                result = (num1 * num2)+"";
            } else if (operator == 2) {
                result = (num1 / num2)+"";
            } else if (operator == 3) {
                result = (num1+num2)+"";
            }else if (operator == 4){
                result = (num1-num2)+"";
            } else if (operator == 5) {
                result = (num1%num2)+"";
            } else {
                result = "The operation is not valid!";
            }
            System.out.println(result);
    }}