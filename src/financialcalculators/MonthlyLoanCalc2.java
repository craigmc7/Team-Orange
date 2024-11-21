package financialcalculators;

public class MonthlyLoanCalc2 {
        // Monthly Payment Function
    public static double monthlyLoanPayment(double interestRate, int yrs, double initAmount) {
         if (interestRate == 0) { 
            //if 0 interest
            return initAmount / (yrs * 12);
        }
        double monthlyInt = interestRate / 12;
        double payment = (initAmount * monthlyInt) / (1 - (1 / Math.pow(1 + monthlyInt, yrs * 12)));
        return payment;
    }
}
