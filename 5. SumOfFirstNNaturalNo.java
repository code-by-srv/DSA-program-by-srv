import java.util.Scanner;

class SumOfFirstNNaturalNo {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number up to which you want to calculate the sum");
         int num = input.nextInt();
         System.out.println("The sum is: "+summation(num));
     }
     public static int summation(int num){
         int i = 1;
         int sum = 0;
         while (i<=num){
             sum = sum + i;
             i++;
         }
         return sum;
     }

}
