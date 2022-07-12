package Day5_ifStatements;

public class c3_ifStatementContinue {
    public static void main(String[] args) {
        //lets define3 different numbers and
        //we will print the max number
        //write a code wher it compares 3 different numbers and print the max number
        int num1=99;
        int num2=27;
        int num3=189;

        boolean num1Max=num1>num2 &&num1>num3;
        boolean num2Max=num2>num1 &&num2>num3;
        boolean num3Max=num3>num2 &&num3>num1;

if(num1Max){
    System.out.println(num1+" is max number");}
    if (num2Max) {
        System.out.println(num2 + " is max number");}
        if (num3Max) {
            System.out.println(num3 + " is max number");}


        }
    }