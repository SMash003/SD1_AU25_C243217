import java.util.Scanner;

public class IIUCtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int x = 100, n = sc.nextInt();
        double p = n/6.0;
        p = Math.ceil(p);
        double total = (p*x);
        System.out.println("Group of friends: ");
        System.out.println(p);
        System.out.println("Cost: ");
        System.out.println(total + " tk");
    }
}
