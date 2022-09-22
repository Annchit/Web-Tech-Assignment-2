import java.util.Scanner;  

public class Assignment2Que3 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give month input");
        int firstInput = sc.nextInt();

        sc.close();

        switch (firstInput){

            case 1:
            System.out.println("Month is January & number of days is 31");
            break;
            case 2:
            System.out.println("Month is February & number of days is 28/29");
            break;
            case 3:
            System.out.println("Month is March & number of days is 31");
            break;
            case 4:
            System.out.println("Month is April & number of days is 30");
            break;
            case 5:
            System.out.println("Month is May & number of days is 31");
            break;
            case 6:
            System.out.println("Month is June & number of days is 30");
            break;
            case 7:
            System.out.println("Month is July & number of days is 31");
            break;
            case 8:
            System.out.println("Month is August & number of days is 31");
            break;
            case 9:
            System.out.println("Month is September & number of days is 30");
            break;
            case 10:
            System.out.println("Month is October & number of days is 31");
            break;
            case 11:
            System.out.println("Month is November & number of days is 30");
            break;
            case 12:
            System.out.println("Month is December & number of days is 31");
            break;
            default:
            System.out.println("enter a valid month");
        }
        
    }
}
