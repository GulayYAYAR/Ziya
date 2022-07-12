package Day3_AritmaticOperation;

public class AritmeticOperation {
    public static void main(String[] args) {
//ADDITION
        int number1=10;
        int number2=20;
        float numberf1=40.7f;
        float number3=number1+numberf1;
        double numberd1= 76.34567;
        long numberl1=9807675893945853L;


//        int number3=number1+number2;
//        System.out.println(number3);

        System.out.println(number1+number2);
        System.out.println(number3);
//SUBSTRACTION
        int num1=50;
        int num2=70;
        int num3=num1-num2;
        System.out.println(num3);
int num4=90;
float num5=90.6f;
float num6= num4-num5;
        System.out.println(num6);
     long l1=9897866L;
     int i1= 23;
     long sub=l1-i1;
        System.out.println(sub);
//MULTIPLICATION
        int m1=34;
        int m2=26;
        int m3=m1*m2;
        System.out.println(m3);
  //DIVISION
  int d1=4;
  int d2=3;
 float d3=(float)d1/d2;  // float koymazsan virgulden sonra 1 kez belirler. sayini tamamini degil!
        System.out.println(d3);
        System.out.println(d1/d2);
 // MODULUS (%) REMINDER
        int mod1=11;
        int mod2=5;
        int mod3=mod1%mod2;
        System.out.println(mod3);

        float mod4=5.8f;
        int mod5=2;
        float mod6=  (float) mod4%mod5;  //float koyunca herhangi bir kargasaya meil vermiyorsun
        System.out.println(mod6);
    }
}
