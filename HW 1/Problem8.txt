import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
