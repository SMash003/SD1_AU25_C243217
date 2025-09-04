import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length(), flag=0;
        for(int i=0; i<len/2; i++)
        {
            if(str.charAt(i) != str.charAt(len -i -1))
            flag=1;
        }
        if(flag == 1)
            System.out.println("Not a palindrome. ");
        else
            System.out.println("Is a palindrome.");
        
    }   
}
