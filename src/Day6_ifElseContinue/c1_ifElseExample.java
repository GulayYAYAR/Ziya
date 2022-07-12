package Day6_ifElseContinue;

public class c1_ifElseExample {
    public static void main(String[] args) {
        // Water temp is 100 it is boiling
        //water temp is 0 it is freezing
        // water temp between 0 to 10
        //water temp between 10-30 will cold
        //water temp 60-90 hot
        //rest


        String WaterCond;
        int temp = 0;

        if(temp == 100){
            WaterCond = "Boiling";}

        else if(temp == 0){
            WaterCond = "Freezing";}

        else if(temp>0 && temp<10){
            WaterCond = "So Cold";}

        else if (temp>=10 && temp<30){
            WaterCond = "Cold";}

        else if(temp>=60 && temp<90){
            WaterCond = "Hot";}

        else if(temp>=90 && temp<100){
            WaterCond = "So Hot";}

        else { // rest Room Temp
            WaterCond = "Room Temp";}

        System.out.println("The Water condition is: "+WaterCond);


    }
}
