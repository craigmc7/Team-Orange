package financialcalculators;

public class MortgagePaymentCalc {
        //Monthly Mortgage Payment Function
    public static double monthlyMortgagePayment (double initAmount, int yrs, double interestRate, double propertyTaxRate) {
            //calculating total payments for loan
        int payments = yrs*12;
            //if 0 intrest
        
        if (interestRate==0) {
            return (initAmount / payments)+ ((propertyTaxRate / 100) * initAmount / 12);
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
        if (propertyTaxRate < 0) return -4;
        
            //calculate interest rate percentage into monthly interest float value
        double monthlyInt = interestRate/100/12;
        
            //base payment calculation
        double mortgagePayment=(initAmount*monthlyInt*Math.pow((1+monthlyInt),payments))/(Math.pow((1+monthlyInt),payments)-1);
        
            //account for monthly property tax and return
        double monthlyPropertyTax = (propertyTaxRate / 100) * initAmount / 12;
        return mortgagePayment + monthlyPropertyTax;        
    }
}
