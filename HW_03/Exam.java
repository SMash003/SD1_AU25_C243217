import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sections: ");
        int sec = sc.nextInt();
        System.out.println("Enter the number of students in each section: ");
        int std = sc.nextInt();
        System.out.println("Enter the number of passed student: ");
        double psd = sc.nextInt();
        double perc = (psd/(sec*std))*100;
        if(perc > 50.00)
        {
            System.out.println("The number of students who passed is greater than 50%");
        }
        else
        System.out.println("The number of students who passed is not greater than 50%");
    }
}
