package Day6_ifElseContinue;

public class ASSIGNMENTtask3 {
    public static void main(String[] args) {
        //task   3:   create   Program   to   check   whether   the   given   number   is   positive   or   negative
//      →   If   a   number   is   greater   than   zero   then   it   is   a   positive   number
//              →   If   a   number   is   less   than   zero   then   it   is   a   negative   number
//              →   If   a   number   is   equal   to   zero   then   it   is   neither   negative   nor   positive.


        int num = 90;

        if (num > 0) {
            System.out.println(num + " is  a  positive  number");
        } else if (num < 0) {
            System.out.println(num + " is  a  negative  number");
        } else {
            System.out.println(num + " is neither  negative  nor  positive.");
        }
    }

}
