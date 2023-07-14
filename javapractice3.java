import java.util.*;
public class javapractice3{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Please Enter a Number");
         int n = sc.nextInt();
         
         if(n > 0 && n % 2 ==0){
             System.out.println("Positive Even");
         }else if (n > 0 && n % 2 != 0){
             System.out.println("Positive odd");
         }else if (n < 0 && n%2 ==0){
             System.out.println("Negative Even");
         }else if (n < 0 && n%2 !=0){
             System.out.println("Negative odd");
         }else if (n==0){
             System.out.println("Zero");
         }else{
             System.out.println("Invalid");
         }
     }
     
}