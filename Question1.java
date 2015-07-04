
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
    	System.out.println("Enter the string to be reversed: ");
		Scanner scanIn = new Scanner(System.in);
        String inputString = scanIn.nextLine();
        scanIn.close();
    	for (String part : inputString.split(" ")) {
    	    System.out.print(new StringBuilder(part).reverse().toString());
    	    System.out.print(" ");
    	}
    }
}
