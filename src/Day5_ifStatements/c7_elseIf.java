package Day5_ifStatements;

public class c7_elseIf {
    public static void main(String[] args) {

        /*if(condition){
        }else if(another condition){
        }else if(another condition){
        }else if(another condition){
        }else if(another condition){
        }else{}
         */


        //100-90 grade A
        //89-80 grade B
        //79-70 grade C
        //69-60 grade D
        //59-0 grade F



int point=110;
if (point>=90 && point<=100) {
    System.out.println("the grade is A");
}else if(point>=80 && point<90){
    System.out.println("the grade is B");
}else if (point>=70 && point<80) {
    System.out.println("the grade is C");
}else if (point>=60 && point<70){
    System.out.println("the grade is D");
}else if(point>=0 && point< 60) {System.out.println("the grade is F");}
else System.out.println("invalid grade");










    }
}
