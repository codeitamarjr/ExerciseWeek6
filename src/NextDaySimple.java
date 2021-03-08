import java.util.Scanner;

public class NextDaySimple {
    public static void main(String[] args){

        int day,month,year;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the day?");
        day = keyboard.nextInt();
        System.out.println("What's the month?");
        month = keyboard.nextInt();
        System.out.println("What's the year?");
        year = keyboard.nextInt();

        if((day+1)>30 & (month+1)>12) { //if the day is greater than 30 and the month is greater then 12, I'll add 1 to year and set day and month to 1
            System.out.println(" The following day of " + day + "\\" + month + "\\" + year + " is 1\\1\\" + (year + 1));
        }

        if((day+1)>30 & (month+1)<=12) { //if the day is greater than 30 and the month is bellow 12, I'll add 1 to month and set day to 1
            System.out.println(" The following day of " + day + "\\" + month + "\\" + year + " is 1\\"+(month+1)+"\\" + year);
        }
        if((day+1)<30){ //for days that's bellow 30, I'll add just 1 to day
            System.out.println(" The following day of " + day + "\\"+month+"\\"+year+" is "+(++day)+"\\"+month+"\\"+year);
        }




    }
}
