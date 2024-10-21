package financialcalculators;

public class MonthlyLoanCalc {
        // Monthly Loan Payment Function
    public static double monthlyLoanPayment(double interestRate, int yrs, double initAmount) {
        interestRate /=100;
        if (initAmount<=0){
            return -1;
        }
        if (yrs<=0){
            return -2;
        }
        if (interestRate<0){
            return -3;
        }
         if (interestRate == 0) { 
            //if 0 interest
            return initAmount / (yrs * 12);
        }
        double monthlyInt = interestRate / 12;
        double payment = (initAmount * monthlyInt) / (1 - (1 / Math.pow(1 + monthlyInt, yrs * 12)));
        return payment;
    }
}
