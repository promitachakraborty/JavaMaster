import java.util.*;
//Leap Year//
public class javaPractice5{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
 
  System.out.println("Please Enter the year");
  int a = sc.nextInt();

if(a % 4 == 0 && a % 100 !=0){
    System.out.println("This is a Leap Year");
}else if (a % 400 == 0){
   System.out.println("This is a Leap Year");


}else{
System.out.println("This is not a leap year");
}


}

}