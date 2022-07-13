package Day9_String;

import java.util.Scanner;

public class Homework {
//    Write a code where user is asked to enter a Name,
//    if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
//    If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
//    If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a name:");
    String name = input.nextLine();
    String name1 = name.toUpperCase();

    if(name1.startsWith("A") && name1.endsWith("L")){
        System.out.println("Your name is " + name1.replace("A", "B"));
    }else if (name1.startsWith("B") && name1.endsWith("L") && name1.contains("A")) {
        name1 = name1.replace(name1.charAt(1),'G');
        System.out.println(name1);
    }else if (name1.startsWith("C") && name1.endsWith("K")){
        if (name.equals("Clark")){
            System.out.println("Your name is Clark");
        } else if (name.equals("CLARK")) {
            System.out.println("Your name is CLARK");
        }else {
            System.out.println("Your name is not Clark or CLARK");
        }
    }
}
}
