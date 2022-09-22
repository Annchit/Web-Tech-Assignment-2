public class Assignment2Que4 {
    
    public static void main(String args[]) {
        
        long population = 80000;
        int yearsTaken = 0;
        
        while(population < 150000){
            population += (population*0.05);
            yearsTaken++;
        }
        
        System.out.println("the numbers of years before population reaches 150000 is " + yearsTaken);
    }
}
