//Q.4: Discount Calculation 

import java.util.Scanner;
public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: Rs.");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String membershipStatus = scanner.next();

        double discount = calculateDiscount(purchaseAmount, membershipStatus);
        double finalAmount = purchaseAmount - (purchaseAmount * discount / 100);

        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Amount: Rs." + finalAmount);

        scanner.close();
    }
     public static double calculateDiscount(double purchaseAmount, String membershipStatus) {
        double discount = 0;

        if (purchaseAmount >= 1000) {
            discount = 20;
        } else if (purchaseAmount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        if (membershipStatus.equalsIgnoreCase("yes")) {
            discount += 5;
        }

        return discount;
    }
}


