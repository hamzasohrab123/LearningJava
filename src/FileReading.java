import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException{

            File myObj = new File("src/hi.txt");
            Scanner scan = new Scanner(myObj);

        while (scan.hasNext()){
            System.out.println(scan.nextLine());

        }
    }
}
