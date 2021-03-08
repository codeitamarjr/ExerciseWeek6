import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String args[]){

        int num1,num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Whats your first number:");
        num1 = keyboard.nextInt();
        System.out.println("What's your second number:");
        num2 = keyboard.nextInt();

        if ((num1-num2)>0){
            System.out.println("The absolute difference is: "+(num1-num2));
        } else {
            System.out.println("The absolute difference is: "+(num2-num1));
        }
    }
}
