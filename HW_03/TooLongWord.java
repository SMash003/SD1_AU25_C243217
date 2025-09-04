import java.util.Scanner;

public class TooLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        int len = str.length();
        if(len > 10)
        {
            System.out.println(str.charAt(0) + String.valueOf(len-2) + str.charAt(len-1));
        }
        else
            System.out.println(str);
    }
}
