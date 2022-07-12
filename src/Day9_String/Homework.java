package Day9_String;

import java.util.Scanner;

public class Homework {
//    Write a code where user is asked to enter a Name,
//    if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
//    If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
//    If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.
public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Please Enter a Name");

   String name=input.nextLine();
    String name1=name.replace('A','B');
    String name2=name.replace('A','G');
    String name3= String.valueOf(name.equals("Clark")||name.equals("CLARK"));

   if( name.startsWith("A") && name.endsWith("L") );{

    System.out.println(name1);}
//    boolean check= name.startsWith("B") && name.endsWith("L");
    if( name.startsWith("B")&& name.endsWith("L"));{
        if (name.contains("A"))
        System.out.println(name2);}
    if (name.startsWith("C")&& name.endsWith("K"));{

    System.out.println(name3);}

}
}
