class MinOfThree
{
    public static void main(String args[]) {
        
        int firstValue = 3,secondValue = 4,thirdValue = 5;

        if(firstValue < secondValue){
            if(firstValue < thirdValue){
                System.out.println(firstValue);
            }
            else{
                System.out.println(thirdValue);
            }
        }
        else{
            if(secondValue < thirdValue){
                System.out.println(secondValue);
            }
            else{
                System.out.println(thirdValue);
            }
        }
        
    }
}