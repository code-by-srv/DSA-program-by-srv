import java.util.Scanner;

class SumOfTwoNumbers {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the first number");
         int num1 = input.nextInt();
         System.out.println("Enter the second number");
         int num2 = input.nextInt();
         int finalSum = sum(num1,num2);
         System.out.println("The sum is: "+finalSum);
     }
     public static int sum(int num1, int num2){
         int summation = num1+num2;
         return summation;
     }
}
