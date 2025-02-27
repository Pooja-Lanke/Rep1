import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter marks for Subject 1: ");
         int sub1 = sc.nextInt();
         System.out.print("Enter marks for Subject 2: ");
         int sub2 = sc.nextInt();
         System.out.print("Enter marks for Subject 3: ");
         int sub3 = sc.nextInt();

         int failCount = 0;
        failCount += (sub1 <= 40) ? 1 : 0;
        failCount += (sub2 <= 40) ? 1 : 0;
        failCount += (sub3 <= 40) ? 1 : 0;

        switch (failCount) {
            case 0:
                System.out.println("The student has passed.");
                break;
            default:
                System.out.println("The student has failed in " + failCount + " subject(s).");
                break;
        }
    }
  }
