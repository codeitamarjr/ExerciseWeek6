import java.util.Scanner;

public class OrderTwoNumbers {
    public static void main (String args[]){

        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your first integer");
        int firstNumber = keyboard.nextInt();
        System.out.println("Enter your second integer");
        int secondNumber= keyboard.nextInt();

        if (firstNumber>secondNumber){
            System.out.println("your first number "+ firstNumber + " is bigger than your second number " +secondNumber);
        }
        else {
            System.out.println("Your second integer " + secondNumber + " is bigger than your first integer " + firstNumber);
        }
    }
}
