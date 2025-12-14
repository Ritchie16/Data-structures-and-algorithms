public class Factorial{
    public static int factorial(int num){
        int sum;
        
        if(num == 0 || num == 1) {

            
            return 1;
            
        }

        sum = num * factorial(num - 1);

        return sum;
        
    }

    public static void main(String[] args) {
        
        System.out.println("\n\n" + factorial(5) + "\n\n");
    }
}