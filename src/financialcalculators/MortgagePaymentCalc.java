package financialcalculators;

public class MortgagePaymentCalc {
        //Monthly Mortgage Payment Function
    public static double monthlyMortgagePayment (double initAmount, int yrs, double interestRate) {
            //calculating total payments for loan
        int payments = yrs*12;
            //if 0 intrest
        if (interestRate==0) {
            return (initAmount/payments);
        }
        if (initAmount<=0) {
            return -1;
        }
        if (yrs<=0) {
            return -2;
        }
        if (interestRate<0){
            return -3;
        }
            //calculate interest rate percentage into monthly interest float value
        double monthlyInt = interestRate/100/12;
        
            //payment calculation and return
        double mortgagePayment=(initAmount*monthlyInt*Math.pow((1+monthlyInt),payments))/(Math.pow((1+monthlyInt),payments)-1);
        return mortgagePayment;
    }
}
