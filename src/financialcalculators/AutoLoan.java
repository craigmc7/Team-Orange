/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financialcalculators;

/**
 *
 * @author mwrai
 */
public class AutoLoan {
    public static double monthlyPay(double autoPrice, int loanTerm,double intRate,double downPayment, double tradeIn,double tax){
        double totalCost = (autoPrice - tradeIn) * (1+(tax/100));
        totalCost-=downPayment;
        double monthlyPay = (totalCost * ((intRate/100)/12)) / (1 - (1 / Math.pow((1+((intRate/100)/12)), loanTerm)));
        return monthlyPay;
    }
    public static double vehiclePrice(double monthlyPay,int loanTerm,double intRate,double tradeIn,double downPayment,double tax,double totalLoanAmt){
        double taxRate = tax/100;
        double totalTax = (taxRate*downPayment + taxRate*totalLoanAmt)/(1+taxRate);
        double vehiclePrice = downPayment-totalTax+totalLoanAmt;
        vehiclePrice+=tradeIn;
        return vehiclePrice;
    }
    public static double totalLoanAmount(double monthlyPay, double intRate,int loanTerm){
        double monthlyInt = intRate/100/12;
        double totalLoanAmt = monthlyPay * ((1-Math.pow(1+monthlyInt,loanTerm*-1))/monthlyInt);
        return totalLoanAmt;
    }
    
    //total cost when calculating the total price
    public static double totalCost1(double monthlyPay,int loanTerm,double downPayment,double tradeIn){
        double totalCost = monthlyPay*loanTerm;
        totalCost+=downPayment;
        totalCost+=tradeIn;
        return totalCost;
    }
    //total cost when calculating the monthly payment
    public static double totalCost2(double autoPrice,double downPayment,double tradeIn,double tax){
    double totalCost = (autoPrice - tradeIn) * (1+(tax/100));
    totalCost-=downPayment;
    return totalCost;
    }
    public static double totalTax(double tax,double downPayment,double totalLoanAmt){
        double taxRate = tax/100;
        double totalTax = (taxRate*downPayment + taxRate*totalLoanAmt)/(1+taxRate);
        return totalTax;
    }
}
