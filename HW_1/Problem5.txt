import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        double res;
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        char op = sc.next().charAt(0);
        double b = sc.nextInt();

        switch (op) {
            case '+':
                res = a + b;
                System.out.println(res);
                break;
            case '-':
                res = a - b;
                System.out.println(res);
                break;
            case '*':
                res = a * b;
                System.out.println(res);
                break;
            case '/':
                res = a / b;
                System.out.println(res);
                break;
        
            default:
                System.out.println("Invalid operator.");
        }
    }
}
