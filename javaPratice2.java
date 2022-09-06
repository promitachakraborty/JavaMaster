import java.util.*;
public class javaPratice2{
      
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    
     System.out.println("Please Enetr a Number");

     int n = sc.nextInt();

   if(n < 0){
    
   System.out.println("Invalid!!Please Enter a positive number..");

}else{
  
  System.out.println(n*(n+1)/2);
}

}

}