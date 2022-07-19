package Day11_ForLoopCont;

import java.util.Scanner;

public class c4_ForLoopExample2 {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); // Scanner from the user input

    System.out.println("Please enter a String: ");
    String str= scan.next();

    for(int i = 0; i<str.length(); i++){

        if(str.charAt(i)== 'A' || str.charAt(i)== 'a'){ // If the String contains A,
            str = str.toUpperCase(); // Then Make all to Upper Case,
            System.out.println(str);
        }else{
            str = str.toLowerCase(); // Make it lower case
            System.out.println(str); // Print Lo
        }
    }
    System.out.println(str);// The last value of the FromScan.
    // The Last Char is deciding the last value of FromScan String to be either upper or lower case,

}
}

