import java.util.*;

public class Lcm {

    public static void lcm(){

        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        n1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        while (n1 % n2 != 0){

            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);


    }

    public static void main(String[] args) {
        lcm();
    }

}
