import java.util.Scanner;

public class FillWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is bottle-1 full?(Y=1/N=0): ");
        int b1 = sc.nextInt();
        System.out.println("Is bottle-2 full?(Y=1/N=0): ");
        int b2 = sc.nextInt();
        System.out.println("Is bottle-3 full?(Y=1/N=0): ");
        int b3 = sc.nextInt();
        if(b1==1 && b2==0 && b3==0 || b1==0 && b2==1 && b3==0 || b1==0 && b2==0 && b3==1)
        {
            System.out.println("Water filling time.");
        }
        else
            System.out.println("Not now.");
    }
}
