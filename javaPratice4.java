import java.util.*;
//Largest of Three Numbers//
public class javaPratice4{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the First number");
       int a = sc.nextInt();
 System.out.println("Please enter the Second number");
       int b = sc.nextInt();
 System.out.println("Please enter the Third number");
       int c = sc.nextInt();
 System.out.println("The Largest number is:");
      if (a > b && a > c){
         System.out.print(a);

}else if(b > a && b >c) {
      System.out.print(b);
}else{
System.out.print(c);
}
   }

}