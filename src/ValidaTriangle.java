import java.util.Scanner;

public class ValidaTriangle {
    public static void main (String[] args){

        int side1,side2,base;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the size of your first side");
        side1 = keyboard.nextInt();
        System.out.println("What's the size of your second side");
        side2 = keyboard.nextInt();
        System.out.println("What's the size of your base");
        base = keyboard.nextInt();

        if((side1+side2)>base){
            System.out.println("Congratulations you have a Triangle!");
        } else{
            System.out.println("You don't have an triangle!");
        }

    }
}
