import java.util.Scanner;

public class EvenDivision {
    public static void main(String args[]){

        int number1,number2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your first number?");
        number1 = keyboard.nextInt();
        System.out.println("What's your second number?");
        number2 = keyboard.nextInt();
        int remainder = number1 % number2;

        if( remainder == 0){
            System.out.println("The first integer "+number1+" is divisible by the second number "+number2);
        } else {
            System.out.println("Unfortunately the first number "+number1+" is not divisible by the second one "+number2);
        }
    }
}
