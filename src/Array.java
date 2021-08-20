import java.util.*;

public class Array
{
    public static void main(String[] args) {

        // another way to declare an array
        //int[] array = {5, 4, 3, 2, 1};

        int[] array = new int[5];
        for (int i = 0;i < 5; i++) {
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array[" + i + "] Element of Array: ");
            x = sc.nextInt();
            System.out.println("Array["+ i +"] = " + x);

        }
    }
}


