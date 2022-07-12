package Day5_ifStatements;

public class c2_ifStatement {
    public static void main(String[] args) {
        //if is a condition where it decide if the code block should run or not
   /*
    if (condition){
    hello
    go this way
    */

        String name="ziya";
        int i1=10
                ;
        if (i1==10){
            System.out.println(name);
        }

        System.out.println("This is outside of if statement");

        if(10>11){
            System.out.println("This is non sense");
        }

String name1="Recep";
        if(name1=="Recep"){
            System.out.println(name1);
        }

int a=10;
        if (++a==11){
            System.out.println("a is 11");
        }
if (a==11){
    System.out.println("This is secound line");
}
}
}