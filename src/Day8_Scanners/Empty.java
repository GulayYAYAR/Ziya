package Day8_Scanners;

import java.util.Scanner;

public class Empty { public static void main(String[] args) {
    Scanner cal = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int selection1;
        int selection2;
        int selection3;
        int shirtPrice = 40;
        int pantsPrice = 60;
        int dressPrice = 100;
        int hatPrice = 10;
        int shoesPrice = 120;
        int totalPrice = 0;
        double finalPrice;

        System.out.println("Please select 3 items for your shopping cart: ");
        System.out.println("Select 1 for Shirt\n" +
                "Select 2 for pants\n" +
                "Select 3 for dress\n" +
                "Select 4 for hat\n" +
                "Select 5 for shoes");

        System.out.println("Please pick your first item: ");
        selection1 = scanner.nextInt();

        System.out.println("Please pick your second item: ");
        selection2 = scanner.nextInt();

        System.out.println("Please pick your last item: ");
        selection3 = scanner.nextInt();


        switch (selection1) {
            case (1):
                totalPrice = totalPrice + shirtPrice;
                break;
            case (2):
                totalPrice = totalPrice + pantsPrice;
                break;
            case (3):
                totalPrice = totalPrice + dressPrice;
                break;
            case (4):
                totalPrice = totalPrice + hatPrice;
                break;
            case (5):
                totalPrice = totalPrice + shoesPrice;
                break;
            default:
                System.out.println("Invalid selection for the fist item");
        }

        switch (selection2) {
            case (1):
                totalPrice = totalPrice + shirtPrice;
                break;
            case (2):
                totalPrice = totalPrice + pantsPrice;
                break;
            case (3):
                totalPrice = totalPrice + dressPrice;
                break;
            case (4):
                totalPrice = totalPrice + hatPrice;
                break;
            case (5):
                totalPrice = totalPrice + shoesPrice;
                break;
            default:
                System.out.println("Invalid selection for the second item");
        }

        switch (selection3) {
            case (1):
                totalPrice = totalPrice + shirtPrice;
                break;
            case (2):
                totalPrice = totalPrice + pantsPrice;
                break;
            case (3):
                totalPrice = totalPrice + dressPrice;
                break;
            case (4):
                totalPrice = totalPrice + hatPrice;
                break;
            case (5):
                totalPrice = totalPrice + shoesPrice;
                break;
            default:
                System.out.println("Invalid selection for the third item");
        }

        if (totalPrice > 200) {
            finalPrice = totalPrice * 0.80;
        } else if (totalPrice > 150) {
            finalPrice = totalPrice * 0.85;
        } else if (totalPrice > 100) {
            finalPrice = totalPrice * 0.95;
        } else {
            finalPrice = totalPrice;
        }

        System.out.println("Your final price is: " + finalPrice);
    }
}
