import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine(), strU, strL;
        strU = str.toUpperCase();
        strL = str.toLowerCase();
        System.out.println("Converted to upper case: " + strU);
        System.out.println("Converted to lower case: " + strL);
    }
}
