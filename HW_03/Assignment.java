import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int n = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting time in 24hr format: ");
        double x = sc.nextDouble();
        if( (x + n) <= 22)
        {
            System.out.println("You will finish all assignments on time!");
        }
        else
            System.out.println("You will not finish all assignments before 10 PM.");
       
    }
}
