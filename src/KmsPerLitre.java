import java.util.Scanner;

public class KmsPerLitre {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the number of km that you travelled by car?");
        int kilometerTravelled = keyboard.nextInt();
        System.out.println("How much liters of Diesel you used?");
        int dieselUsed = keyboard.nextInt();

        double kilometerPerDiesel=(double)dieselUsed/kilometerTravelled;

        if (kilometerTravelled<0 | dieselUsed<0){
            System.out.println("You have entered a negative number!");
        }
        if(kilometerTravelled>0 & dieselUsed>0) {
            System.out.format("You have consumed %.2f liters of Diesel per each Kilometer",kilometerPerDiesel);


        }
    }
}
