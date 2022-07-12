package Day8_Scanners;
import java.util.Scanner;

public class ChallengeQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1) Select 1 for shirt\n2) Select 2 for pants \n3) Select 3 for dress\n4) Select 4 for hat\n5)Select 5 for shoes");

        double price1 = 0;
        double price2 = 0;
        double price3 = 0;

        System.out.println("Enter First Item : ");
        int item1 = input.nextInt();

        if (item1 == 1) {price1 = 40; System.out.println("Shirt added your card");
        } else if (item1 == 2) {price1 = 60; System.out.println("Pant added your card");
        } else if (item1 == 3) {price1 = 100; System.out.println("Dress added your card");
        } else if (item1 == 4) {price1 = 10; System.out.println("Hat added your card");
        } else if (item1 == 5) {price1 = 120; System.out.println("Shoes added your card");
        } else System.out.println("Please select the items listed.");


        System.out.println("Enter Second Item :");
        int item2 = input.nextInt();

        if (item2 == 1) {price2 = 40;
            System.out.println("Shirt added your card");
        } else if (item2 == 2) {price2 = 60; System.out.println("Pant added your card");
        } else if (item2 == 3) {price2 = 100; System.out.println("Dress added your card");
        } else if (item2 == 4) {price2 = 10; System.out.println("Hat added your card");
        } else if (item2 == 5) {price2 = 120; System.out.println("Shoes added your card");
        } else System.out.println("Please select the items listed.");

        System.out.println("Enter Third Item : ");
        int item3 = input.nextInt();

        if (item3 == 1) {price3 = 40; System.out.println("Shirt added your card");
        } else if (item3 == 2) {price3 = 60; System.out.println("Pant added your card");
        } else if (item3 == 3) {price3 = 100; System.out.println("Dress added your card");
        } else if (item3 == 4) {price3 = 10; System.out.println("Hat added your card");
        } else if (item3 == 5) {price3 = 120; System.out.println("Shoes added your card");
        } else System.out.println("Please select the items listed.");




        double TOTAL = price1 + price2 + price3;
        System.out.println("Total price before discount applied on your selected items: $" + TOTAL);

        double newAmount;
        if (TOTAL >= 200) {
            newAmount = TOTAL - (TOTAL * 0.20);
            System.out.println("You have 20% discount and your new amount: $" + newAmount);
        } else if (TOTAL >= 150 && TOTAL < 200) {
            newAmount = TOTAL - (TOTAL * 0.15);
            System.out.println("You have 15% discount and your new amount: $" + newAmount);
        } else if (TOTAL >= 100 && TOTAL < 150) {
            newAmount = TOTAL - (TOTAL * 0.05);
            System.out.println("You have 5% discount and new amount: $" + newAmount);}
        else System.out.println("Please Select 3 items( you can choose only one time each item)");

    }}








//        Challenge Question:
// Write a program Where user is being ask to select items from the list you presented for instance:
//        Select 1 for Shirt
//        Select 2 for pants
//        select 3 for dress
//        select 4 for hat
//        select 5 for shoes
//        User will select select one item each time and until users has 3 items.
//        shirt price is = 40
//        pants price is = 60
//        dress price is = 100
//        hat price is = 10
//        shoes price is = 120
//        if user total amount is more than 200, user will receive 20% off on the total price
//        if user total amount is more than 150, user will receive 15% off on the total  price
//        if user total amount is more than 100, user will receive 5% off on the total price
//












//
//        double shirt=40;
//        double pant=60;
//        double dress=100;
//        double hat=10;
//        double shoes=120;
//        double price;
//
//
//        if(item1==1 && item2==2 && item3==3){
//            price=shirt+pant+dress; System.out.println("Total price of this three items :" +price);}
//        else if (item1==1 && item2==2 && item3==4) {
//            price = shirt + pant + hat; System.out.println("Total price of this three items :" +price);
//        }else if (item1==1 && item2==2 && item3==5) {
//            price=shirt+pant+shoes; System.out.println("Total price of this three items :" +price);
//        }else if (item1==1 && item2==3 && item3==4) {
//            price= shirt+dress+hat; System.out.println("Total price of this three items :" +price);
//        } else if (item1==1 && item2==3 && item3==5) {
//            price=shirt+dress+shoes; System.out.println("Total price of this three items :" +price);
//        } else if (item1==1 && item2==4&& item3==5) {
//            price=shirt+hat+shoes; System.out.println("Total price of this three items :" +price);
//        } else if (item1==2 && item2==3 && item3==4) {
//            price= pant+dress+hat; System.out.println("Total price of this three items :" +price);
//        } else if (item1==2 && item2==3 && item3==5) {
//            price= pant+dress+shoes; System.out.println("Total price of this three items :" +price);
//        } else if (item1==3 && item2==4 && item3==5) {
//            price=dress+hat+shoes; System.out.println("Total price of this three items :" +price);
//        }else System.out.println("You can't get items are not listed or any item more then two times!");
//
//           }}





















//
//
//        double item1 = cal.nextDouble();
//
//        if(item1==1){
//            item1=40;
//        }else if (item1==2){
//            item1=60;
//        } else if (item1==3) {
//            item1= 100;
//        }else if (item1==4){
//            item1= 10;
//        }else if (item1==5){
//            item1=120;
//        }else System.out.println("You have chosen an invalid item.");
//        System.out.println("The cost of your first item is: "+item1);
//
//        System.out.println("Please choose your second item.");
//        System.out.println("1) Select 1 for shirt\n2) Select 2 for pants \n3) Select 3 for dress\n4) Select 4 for hat\n5)Select 5 for shoes");
//        double item2 = cal.nextDouble();
//
//        if(item2==1){
//            item2=40;
//        }else if (item2==2){
//            item2=60;
//        } else if (item2==3) {
//            item2= 100;
//        }else if (item2==4){
//            item2= 10;
//        }else if (item2==5){
//            item2=120;
//        }else System.out.println("You have chosen an invalid item.");
//        System.out.println("The cost of your second item is: "+item2);
//        System.out.println("Please select your third item.");
//        System.out.println("1) Select 1 for shirt\n2) Select 2 for pants \n3) Select 3 for dress\n4) Select 4 for hat\n5)Select 5 for shoes");
//        double item3 = cal.nextDouble();
//
//        if(item3==1){
//            item3=40;
//        }else if (item3==2){
//            item3=60;
//        } else if (item3==3) {
//            item3= 100;
//        }else if (item3==4){
//            item3= 10;
//        }else if (item3==5){
//            item3=120;
//        }else System.out.println("You have chosen an invalid item.");
//        System.out.println("The cost of your third item is: "+item3);
//
//        String result = "";
//        Double resultnum = null;
//        if(item1+item2+item3>=200){
//            resultnum= (item1+item2+item3)-((item1+item2+item3)*.20);
//            result= "You have received a discount of 20%";
//        }else if (item1+item2+item3>150 && item1+item2+item3<=200){
//            resultnum= (item1+item2+item3)-((item1+item2+item3)*.15);
//            result= "You have received a discount of 15%";
//        }else if (item1+item2+item3>=100 && item1+item2+item3<=150){
//            resultnum= (item1+item2+item3)-((item1+item2+item3)*.05);
//            result= "You have received a discount of 5%";
//        } else System.out.println("Due to your shopping cart total you aren't qualified for a discount.");
//
//        System.out.println( "Your shopping cart comes to "+(item1+item2+item3)+" before taxes. "+ result + ", therefore your total comes to: "+(resultnum*1.13)+" including taxes, p.s Canadian tax lol" );









