import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine(), fl, rl;
        fl = str.substring(0,1);
        rl = str.substring(1, str.length());
        fl = fl.toUpperCase();
        System.out.println(fl + rl);

    }
}
