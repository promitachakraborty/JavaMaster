import java.util.*;

public class calculator {
  public static void main(String[] args) {

    char operator;
    Double a, b, result;

   
    Scanner input = new Scanner(System.in);

   
    System.out.println("Choose an operator: +, -, *, / or %");
    operator = input.next().charAt(0);

   
    System.out.println("Enter first number");
    a = input.nextDouble();

    System.out.println("Enter second number");
    b = input.nextDouble();

    switch (operator) {

      //Addition

      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
       break;

         
      // Subtraction

      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);

           break;
       
      //  Multiplication

      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
          
             break;

      //  Division 
      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);


            break;

       //Modulo or remainder
      case '%':
        result = a % b;
        System.out.println(a + " % " + b + " = " + result);

             break;
       

     
        
    }

    
  }
}