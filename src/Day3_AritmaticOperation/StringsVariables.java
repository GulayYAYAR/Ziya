package Day3_AritmaticOperation;

public class StringsVariables {
    public static void main(String[] args) {
        //string is not a primitive data type.
       // String any name ="write anything";


        String name1="12345";
        String name2="Ziya";
        String name3= name1+name2;
              System.out.println(name3);

        String name4=name1+ " " +name2;
               System.out.println(name4);

                 System.out.println(name1+ " \'this is between two strings as a text\' " +name2);

       int a=8;
                System.out.println("This is a number a : " +a);

        float b=7.9f;
                System.out.println("This is the float number: " +b);

        char ch1='R';
        String s1= "Toys"+"-"+ch1+" "+"Us";
                System.out.println(s1);

        int x= 34;
        String name="This is us";
        String name0= name+" " +x;
                System.out.println(name0);
    }
}
