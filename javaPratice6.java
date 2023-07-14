import java.util.*;
import java.lang.Math;

public class javaPratice6{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

double a , b , result;

 System.out.println("Enter 1- Addition \n Enter 2- Subtaction \n Enter 3- Multiplication \n Enter 4- Divide \n Enter 5 - Modulo \n Enter 6- SqaureRoot \n Enter 7 - Power \n Enter 8 - Sin \n Enter 9 - Cos \n Enter 10 - Tan \n Enter 11 - CubeRoot \n Enter 12 - log");

  int button = sc.nextInt();
  
   
System.out.println("Enter the First number");
 a = sc.nextDouble();

System.out.println("Enter the Second number");
 b = sc.nextDouble();


   switch (button){
 case 1:
   result = a + b;
System.out.println(a + "+" + b + " = ");
System.out.println( result);
  break;

case 2:
 
  result = a - b;
System.out.println(a + "-" + b + " = ");
System.out.println(result);
break;
 
case 3:
  result = a * b;
System.out.println(a + "*" + b + " = ");
System.out.println(result);
  break;

case 4:
  result = a / b;
System.out.println(a + "/" + b + " = ");
System.out.println(result);
  break;

case 5:
  result = a % b;
System.out.println(a + "%" + b + " = ");
System.out.println(result);
  break;

case 6:
  System.out.println("Square Root of " + a + " is :");
 System.out.println(Math.sqrt(a));
System.out.println("   ");
System.out.println("Square Root of " + b + " is :");
 System.out.println(Math.sqrt(b));
break;

case 7 :

  System.out.println("Power of a  is :");
System.out.println(Math.pow(a,b));
System.out.println("   ");
 System.out.println("Power of b is :");
System.out.println(Math.pow(b,a));
break;
 
case 8 :
System.out.println(" Sin of " + a + " degree is :");
 a = Math.toRadians(a);
 System.out.println(Math.sin(a));
System.out.println("   ");
System.out.println(" Sin of " + b + " degree is :");
b = Math.toRadians(b);
System.out.println(Math.sin(b));
break;

case 9 :
System.out.println("Cos of " + a + " degree is : ");
a = Math.toRadians(a);
System.out.println(Math.cos(a));
System.out.println("   ");
System.out.println("Cos of " + b + " degree is : ");
b = Math.toRadians(b);
System.out.println(Math.cos(b));
break;

case 10:

System.out.println("Tan of " + a + " degree is : ");
a = Math.toRadians(a);
System.out.println(Math.tan(a));
System.out.println("   ");
System.out.println("Tan of " + b + " degree is : ");
b=Math.toRadians(b);
System.out.println(Math.tan(b));
break;

case 11:
System.out.println("Cuberoot of " + a + " is : ");
System.out.println(Math.cbrt(a));
System.out.println("   ");
System.out.println("Cuberoot of " + b + " is : ");
System.out.println(Math.cbrt(b));

break;

case 12:
System.out.println("log of " + a + " is :");
System.out.println(Math.log(a));
System.out.println("   ");
System.out.println("log of " + b+ " is :");
System.out.println(Math.log(b));
break;

default:
System.out.println("Invalid operator");



 }
}

}