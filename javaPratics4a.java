import java.util.*;

public class javaPratics4a{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
System.out.println("Please Enter the First Number");
   int a = sc.nextInt();
System.out.println("Please Enter the Second Number");
   int b = sc.nextInt();
System.out.println("Please Enter the Third Number");
   int c = sc.nextInt();

int ans_1=Math.max(a,b);
int ans=Math.max(ans_1,c);
System.out.println("The Largest Number is:");
System.out.println(ans);

}

}