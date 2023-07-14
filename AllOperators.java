public class AllOperators {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;

        // Arithmetic Operator
        int add = num1 + num2;
        int mul = num1 * num2;
        int sub = num1 - num2;
        int mod = num1 % num2;
        int div = num1 / num2;

        System.out.println("Addition :" + " " + num1 + " " + "+" + " " + num2 + " " + "=" + add);
        System.out.println();
        System.out.println("Multiplication :" + " " + num1 + " " + "*" + " " + num2 + " " + "=" + mul);
        System.out.println();
        System.out.println("Subtraction :" + " " + num1 + " " + "-" + " " + num2 + " " + "=" + sub);
        System.out.println();
        System.out.println("Modulus : " + " " + num1 + " " + "%" + " " + num2 + " " + "=" + mod);
        System.out.println();
        System.out.println("Division : " + " " + num1 + " " + "/" + " " + num2 + " " + "=" + div);

        // Assignment Operator
        int z = 50;

        z += 50;
        System.out.println("z+= 50" + " " + "=" + z);

        z -= 50;
        System.out.println("z-= 50" + " " + "=" + z);

        z *= 50;
        System.out.println("z*= 50" + " " + "=" + z);

        z /= 50;
        System.out.println("z/= 50" + " " + "=" + z);
        z %= 50;

        System.out.println("z%= 50" + " " + "=" + z);

        // Inrement/Decrement
        int p = 60;
        p++;
        System.out.println("p++" + " " + p);

        p--;
        System.out.println("p--" + " " + p);

        // Logical Operator
        int num3 = 100;
        int num4 = 120;
        int num5 = 200;
        if (num3 < num4 && num4 > num5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (num3 < num4 || num4 > num5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
