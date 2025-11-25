import java.util.Scanner;

class SimpleInterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the principal");
         int P = input.nextInt();
         System.out.println("Enter the rate in percentage");
         float t = input.nextFloat();
         System.out.println("Enter the time in year");
         float r = input.nextFloat();

         System.out.println("Simple Interest is: "+si(P,r,t));
     }
     public static double si(int P, float r,float t){
         return (P*r*t/100);
     }
}
