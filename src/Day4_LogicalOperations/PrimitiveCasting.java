package Day4_LogicalOperations;

public class PrimitiveCasting {
    public static void main(String[] args) {

//casting from smaller size to bigger size is not an issue but going from bigger size to smaller we have to specify


int A= 300;
byte b=(byte)A; //it is not recommended going down

        System.out.println(b);

byte number1=100;
int number2=number1;
        System.out.println(number2);

byte number3 =(byte)number2;
        System.out.println(number3);

int i1=32248;
long i2=(int) i1;

long i3= 9359583985L;
int i4=(int)i3;

float x=98.9f;
double y=x;

int numberint= 3938393;
float numberfloat = (float) numberint;
        System.out.println(numberfloat);



    }
}
