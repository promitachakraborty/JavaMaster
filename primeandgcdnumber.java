public class primeandgcdnumber {

  public static void main(String[] args) {

    int num = 30;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
         
       
      
    int n1 = 30, n2 = 90;
    
    // initially set to gcd
    int gcd = 1;

    for (int i = 1; i <= n1 && i <= n2; ++i) {

      // check if i perfectly divides both n1 and n2
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
        
  }
}
