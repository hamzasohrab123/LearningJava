import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(""+ num +" is a Even Number");
        }
        else{
            System.out.println(""+ num +" is a Odd Number");
        }
    }

}
