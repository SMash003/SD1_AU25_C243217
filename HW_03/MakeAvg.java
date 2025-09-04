import java.util.Scanner;

public class MakeAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of A: ");
        int a = sc.nextInt();
        System.out.println("Input value of C: ");
        int c = sc.nextInt();
        double b = (a+c)/2.0;
        if(b == (int)b)
        {
            System.out.println("B is an integer and the value of B is equal to the avg. of A & C.");
            System.out.println("B = " + b);
        }
        else
            System.out.println("B is not an integer.");
    }
}
