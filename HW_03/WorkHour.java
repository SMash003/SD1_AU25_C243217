import java.util.Scanner;

public class WorkHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Working hour each day from Sat to Tues: ");
        int x = sc.nextInt();
        System.out.println("Working hour of chill day: ");
        int y = sc.nextInt();
        if(y < x)
        {
            int total = (4*x)+y;
            System.out.println("Total number of working hours in a week: " + total);
        }
        else
            System.out.println("Chill Day's working hours can't be equal to or more than other days' working hours.");
    }
}
