package Day10_StringMethos;

import java.util.Locale;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        First create one string and copy paste below paragraf.
//        And make modifications on the given paragraph listed below.

//        Make sure to create multiple string with each sentence from given paragraph
//        Make sure each sentence start with upper case letter.
//        Make sure city name start with the capital letter.
//        Make sure the rest of the letters are lower case.
//        Make sure to change the name, age and city information based on your information
//        make sure to get rid of the empty spaces in front and end of the sentences.
//        after you make the modification check each sentense’s length
//        Print each sentence and make sure they are correctly modified.
//        Print 1st, 4th and 5th indexed characters for each sentence
//        At the end combine all the sentence to get proper paragraph with modified sentences
//        hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.   I have been in IT industry for about 6 years.
//            I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs.
//                i HAve scrum master and Oracle java Programmer c
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();
        System.out.println("Please enter your city which you live in: ");
        String city = scan.nextLine();
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        String fullname = firstName.concat(" " + lastName);

        String str1 = "hello my name is " + fullname + ".";
        String new1 = str1.substring(0, 1).toUpperCase() + str1.substring(1) ;
        String str2 = "       i am " + age + " years old. ";
        String new2 = str2.substring(0, 1).toUpperCase() + str2.substring(1) ;
        String str3 = " i live in " + city + ". ";
        String new3 = str3.substring(0, 1).toUpperCase() + str3.substring(1) ;
        String str4 = "  I have been in IT industry for about 6 years.";
        String new4 = str4.substring(0, 1).toUpperCase() + str4.substring(1) ;
        String str5 = " I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. ";
        String new5 = str5.substring(0, 1).toUpperCase() + str5.substring(1).toLowerCase() ;
        String str6 = "I have experience in EducatION, energy,finance and some manY Other AREAs. ";
        String new6 = str6.substring(0, 1).toUpperCase() + str6.substring(1).toLowerCase() ;
        String str7 = "i HAve scrum master and Oracle java Programmer c";
        String new7 = str7.substring(0, 1).toUpperCase() + str7.substring(1).toLowerCase() ;

        String c1 = new1.concat(new2).concat(new3).concat(new4).concat(new5).concat(new6).concat(new7);
        System.out.println(c1);


//        boolean b1 = str1.startsWith("H") ;
//        boolean b2 = str2.startsWith("I") ;
//        boolean b3 = str3.startsWith("I") ;
//        boolean b4 = str4.startsWith("I") ;
//       boolean b5 = str5.startsWith("I") ;
//        boolean b6 = str6.startsWith("I") ;
//        boolean b7 = str7.startsWith("I") ;
//
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        System.out.println(b5);
//        System.out.println(b6);
//        System.out.println(b7);
//

    }


}
