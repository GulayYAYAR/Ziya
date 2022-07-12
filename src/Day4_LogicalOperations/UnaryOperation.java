package Day4_LogicalOperations;

public class UnaryOperation {
    public static void main(String[] args) {

        ////unary Plus: + it does Not have any affect on number
        int num=10;
        num= + num;
        System.out.println(num);

        int num1 = -10;
        num1= +num;

        // unary minus: - it will change the sign ot value to be opposite

        int A=-20;
        A =- A;
        System.out.println(A);

        int B=-30;
        B =+ B;
        System.out.println(B);



        //incremental operator :++ it increases the number by1

        int x=8;
        x++;  // bunun anlami x+1 demek
        ++x;  // bunu anlami iki kez ust uste arttirmak
        System.out.println(x);

      //decreasemental operator : -- the number will decrease by1

int A1= 20;
        A1--;
        System.out.println(A1);
           --A1;
        System.out.println(A1);


 // invert : ! it inert the boolean values.


boolean bool1=true;
bool1=! bool1;
        System.out.println(bool1);






















    }
}
