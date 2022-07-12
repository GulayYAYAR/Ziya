package Day4_LogicalOperations;

public class PrePostCondition {
    public static void main(String[] args) {
//after ++
      int num=10;
        System.out.println(num++); // print num but increase one step after //10
        System.out.println(num++); //print num from last  step which means it will be increase //11
        System.out.println(num); //12
num++; //bu direk 1 arttir demek
        System.out.println(num); //13

//before ++
 int num1=10;
        System.out.println(++num1);
        System.out.println(num1);

//after --

        int num2=20;
        System.out.println(num2--);
        System.out.println(num2);


        int x, y, z;
        x = 24;
        y = x++;	// y is given x’s value(24)before it is incremented
                    // and x is then incremented to 25
        z = ++x;	// x is incremented to 25, and z is given x’s value




    }
}
