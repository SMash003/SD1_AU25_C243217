import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine(), str2;
        int len, vowel=0, conso=0;
        str2 = str.toLowerCase().replaceAll("\\s", "");
        len = str2.length();
        for(int i=0; i<len; i++)
        {
            if(
                str2.charAt(i) == 'a' ||
                str2.charAt(i) == 'e' ||
                str2.charAt(i) == 'i' ||
                str2.charAt(i) == 'o' ||
                str2.charAt(i) == 'u'
                )
            {
                vowel++;
            }
            else
                conso++;
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + conso);

    }
}
