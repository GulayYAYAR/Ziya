package Day8_Scanners;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//
//        Write a program Where user is being ask to select items from the list you presented for instance:
//        Select 1 for Shirt
//        Select 2 for pants
//        select 3 for dress
//        select 4 for hat
//        select 5 for shoes
//        User will select one item each time and until users has 3 items.
//        shirt price is = 40
//        pants price is = 60
//        dress price is = 100
//        hat price is = 10
//        shoes price is = 120
//        if user total amount is more than 200, user will receive 20% off on the total price (edited)
//        if user total amount is more than 150, user will receive 15% off on the total  price (edited)
//        if user total amount is more than 100, user will receive 5% off on the total price (edited)

        Scanner input=new Scanner(System.in);
        System.out.println("1) Select 1 for shirt\n2) Select 2 for pants \n3) Select 3 for dress\n4) Select 4 for hat\n5)Select 5 for shoes");
        double price1=0;
        double price2=0;
        double price3=0;

        System.out.println("Enter First Item : ");
        int item1= input.nextInt();

        if(item1==1){price1=40; System.out.println("Shirt added your card");}
        else if (item1==2){price1=60;System.out.println("Pant added your card");}
        else if (item1 == 3) {price1 = 100; System.out.println("Dress added your card");}
        else if (item1 == 4) {price1 = 10; System.out.println("Hat added your card");}
        else if (item1 == 5) {price1 = 120; System.out.println("Shoes added your card");}
        else{System.out.println("Please select the items listed");}

        System.out.println("Enter Second Item : ");
        int item2= input.nextInt();


        if(item2==1){price2=40; System.out.println("Shirt added your card");}
        else if (item2==2){price2=60;System.out.println("Pant added your card");}
        else if (item2 == 3) {price2 = 100; System.out.println("Dress added your card");}
        else if (item2 == 4) {price2 = 10; System.out.println("Hat added your card");}
        else if (item2 == 5) {price2 = 120; System.out.println("Shoes added your card");}
        else{System.out.println("Please select the items listed");}


        System.out.println("Enter Third Item : ");
        int item3= input.nextInt();

        if(item3==1){price3=40; System.out.println("Shirt added your card");}
        else if (item3==2){price3=60;System.out.println("Pant added your card");}
        else if (item3 == 3) {price3 = 100; System.out.println("Dress added your card");}
        else if (item3== 4) {price3= 10; System.out.println("Hat added your card");}
        else if (item3 == 5) {price3 = 120; System.out.println("Shoes added your card");}
        else{System.out.println("Please select the items listed");}

        System.out.println("*******************************************");
        double  TOTAL=price1+price2+price3;
        System.out.println("Total price before discount applied on your selected items: $"+TOTAL);
        System.out.println("*******************************************");
double newAmount;
        if (TOTAL>200){ newAmount=TOTAL-(TOTAL*0.20);System.out.println("You have 20% discount and your new amount: $" + newAmount);}
       else if(150<TOTAL && TOTAL<=200){newAmount=TOTAL-(TOTAL*0.15); System.out.println("You have 15% discount and your new amount: $" + newAmount);}
    else if (100<TOTAL && TOTAL<=150){newAmount=TOTAL-(TOTAL*0.10); System.out.println("You have 10% discount and your new amount: $" + newAmount);}
    else{System.out.println("Please Select 3 items( you can choose only one time each item)");}
    }}

