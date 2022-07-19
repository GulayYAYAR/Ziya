package Day9_String;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        //    Write a code where user is asked to enter a Name,
//    if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
//    If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
//    If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.

        Scanner sc = new Scanner(System.in);

        String userName;
        String NuserName;
        System.out.println("Please Enter Your Name :");
        userName = sc.nextLine();

        if (userName.startsWith("A") && userName.endsWith(("L"))) {
            NuserName = userName.replaceFirst("A", "B");
            System.out.println(NuserName);
        }
        else if (userName.startsWith("B") && userName.endsWith("L")) {
            if (userName.contains("A")) {
                NuserName = userName.replaceFirst("A", "G");
                NuserName = userName.substring(0,1)+"G"+userName.substring(2,userName.length());
                System.out.println(NuserName);
            }
        }
        else if (userName.startsWith("C") && userName.endsWith("K")) {
            NuserName = userName.toUpperCase();
            if (NuserName.equals("CLARK"))
                System.out.println("The name you entered is " +NuserName);
            else System.out.println("The name you entered is not ClarK or CLARK");
        }
        else System.out.println("The name you entered is not equal our criteria");
    }

}

