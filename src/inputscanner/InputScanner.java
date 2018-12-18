

package inputscanner;

import java . util. Scanner;

public class InputScanner {
   
public static void main(String[] args) {
      double num1,num2,sum;
  Scanner input = new Scanner(System.in);
    System.out.println("Enter first number");
      num1 = input.nextDouble();
    System.out.println("Enter secound number");
      num2 = input.nextDouble();
         sum = num1 + num2;
       
  System.out.println("The sum of two numbers is :" +sum);
       
       
    }
    
    
}
