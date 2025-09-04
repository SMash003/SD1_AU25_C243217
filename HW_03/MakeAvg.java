import java.util.Scanner;

public class MakeAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of A: ");
        int a = sc.nextInt();
        System.out.println("Input value of C: ");
        int c = sc.nextInt();
        int avg = (a+c)/2;
        if(sc.hasNextInt())
        {
            System.out.println("Input value of B: ");
            int b = sc.nextInt();
            if(b == avg)
            {
                System.out.println("B is an integer and B = avg of A and C.");
            }
        }
        else
            System.out.println("B is not an integer.");
    }
}
