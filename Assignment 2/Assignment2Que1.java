import java.util.*;  

public class Assignment2Que1
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give score input");
        double firstInput = sc.nextDouble();

        sc.close();

        if(firstInput >= 80 && firstInput < 90){
            firstInput += 5;
        }
        
        System.out.println("the score is " + firstInput);
    }
}
