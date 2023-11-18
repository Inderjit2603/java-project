import java.util.Scanner;

class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();
 
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
 
        double futureValue = calculateFutureValue(principal, annualInterestRate, years);
 
        System.out.println("Future Investment Value: " + futureValue);

        scanner.close();
    }
 
    private static double calculateFutureValue(double principal, double annualInterestRate, int years) {
      
        double monthlyInterestRate = annualInterestRate / 100 / 12;
 
        double futureValue = principal * Math.pow(1 + monthlyInterestRate, years * 12);
 
        return Math.round(futureValue * 100.0) / 100.0;
    }
}

