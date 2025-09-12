import java.util.Scanner;

public class Question_01_P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        System.out.println("Enter the jersey numbers: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            boolean isUnique = true;
            for(int j=0; j<n; j++)
            {
                if(i != j && arr[i] == arr[j])
                {
                    isUnique=false;
                    break;
                }
            }
             if(isUnique)
            {
                count++;
            }
        }
       
        System.out.println(count);
    }
}
