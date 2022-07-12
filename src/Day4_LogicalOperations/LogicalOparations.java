package Day4_LogicalOperations;

public class LogicalOparations {
    public static void main(String[] args) {

//And  &&: if operation contains AND(&&) in order for the result true all of them should result to true

boolean balls= (12>7) && (3<8) && (9==7);    //true true false ==false
        System.out.println(balls);


//Or  ||: if any of the coperassion is true it will return true
         boolean shoes = ( "Ziya"=="ziya")||('c'=='C');
        System.out.println(shoes);

//Not !

        boolean cars= !("red"=="blue");
        System.out.println(cars);








    }
}
