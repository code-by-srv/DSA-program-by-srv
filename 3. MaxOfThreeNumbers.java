import java.util.Scanner;

class MaxOfThreeNumbers {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the First number");
         int num1 = input.nextInt();
         System.out.println("Enter the Second number");
         int num2 = input.nextInt();
         System.out.println("Enter the Third number");
         int num3 = input.nextInt();

         System.out.println("Maximum number is: "+max(num1,num2,num3));
     }
     public static int max(int num1,int num2,int num3){
         if (num1>num2 && num1>num3){
                 return num1;

         } else if (num2>num1 && num2>num3) {
                 return num2;
         }
         else {
             return num3;
         }
     }
}
