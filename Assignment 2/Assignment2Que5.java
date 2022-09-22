import java.util.Scanner;

public class Assignment2Que5 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give the value of n");
        int n = sc.nextInt();

        sc.close();
        
        System.out.println("n       n^2     n^3     n^4 ");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<5;j++){
                System.out.print(Math.pow(i,j) + "\t");
            }
            System.out.print("\n");
        }
    }
}
