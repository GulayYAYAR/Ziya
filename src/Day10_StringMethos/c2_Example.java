package Day10_StringMethos;

import java.util.Locale;
import java.util.Scanner;

public class c2_Example {
    public static void main(String[] args) {
        //user is asked to put a valid emalil(username)
        //Enter a password where the password is at least 9 character

        Scanner input= new Scanner (System.in);
        System.out.println("Please Enter a valid email address");
        String email= input.next();

        String formatedmail=email.toLowerCase();

if(!(formatedmail.startsWith("@"))&&(formatedmail.length()>10) && (formatedmail.contains("@gmail.com")) && (formatedmail.endsWith("@gmail.com"))){
    //@gmail.com total 10 charater it should be more than 10 and end with @gmail.com
        System.out.println("Email is valid");}
        else{
            System.out.println("Your email is not a valid email");
        }

        System.out.println("Please Enter a password which contain at least 9 Character");
        String password= input.next();

     if (password.length()>=9){
         System.out.println("Your password is valid");
     }else {
         System.out.println("Invalid password");}






}}
