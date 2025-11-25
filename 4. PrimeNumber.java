import java.util.Scanner;

class PrimeNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number");
         int num = input.nextInt();
         if (isPrime(num)) {
             System.out.println("The number is Prime");
         }else {
             System.out.println("The number is not prime");
         }
     }
     public static boolean isPrime(int num){
         if (num<1){
             return false;
         }
         int i = 2;
         while (i<num){
             if (num%i==0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
/*
 Numbers 0, 1, and negative numbers are not prime,
 */