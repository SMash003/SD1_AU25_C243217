import java.util.Scanner;

public class FindTheOddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        int odd;
        if (a == b) {
            odd = c;
        } else if (a == c) {
            odd = b;
        } else {
            odd = a;
        }
        System.out.println("The odd number is: " + odd);
    }
}
