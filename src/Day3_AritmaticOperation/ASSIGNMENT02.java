package Day3_AritmaticOperation;

public class ASSIGNMENT02 {
    public static void main(String[] args) {
        //Write a code where
        //You have 3 String Variable to assign persons name,
        //and 3 variables to assign those people’s ages,
        //and 3 more variables to assign those people’s GPA’s
        //So your output should look like something like:
        //Name: Jack      Age: 24    GPA:2.8
        //Name: Sarah     Age: 30    GPA:3.0
        //name: Jonat     Age: 19   GPA: 1.9

        String x="Name: Jack";
        String y="Name: Sarah";
        String z="Name: Jonat";
        String a="Age: ";
        String A="GPA: ";

        int s1age=24;
        float s1gpa= (float) 2.8;
                System.out.println(x+ "\t\t"+ (a+s1age)+ "\t\t" +A +s1gpa);

        int s2age=30;
        float s2gpa= (float) 3.0;
                System.out.println(y+ "\t\t"+ (a+s2age)+ "\t\t" +A +s2gpa);

        int s3age=19;
        float s3gpa= (float) 1.9;
                System.out.println(z+ "\t\t"+ (a+s3age)+ "\t\t" +A +s3gpa);

    }
}
