/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financialcalculators;

/**
 *
 * @author mwrai
 */
public class HouseAffordability {
    public static double HouseAffordabilityCalc(double annualIncome, double downPayment,double percentOfIncome,double intRate,double loanLength){
        if (annualIncome<=0){
            return -1;
        }
        if (downPayment < 0){
            return -2;
        }
        if (percentOfIncome < 0){
            return -3;
        }
        if (intRate < 0){
            return -4;
        }
        if (loanLength <= 0){
            return -5;
        }
        double monthlyIncome = annualIncome/12;
        percentOfIncome /= 100;
        double monthlyPayment = monthlyIncome*percentOfIncome;
        double months = loanLength*12;
        double monthlyInt = (intRate/100)/12;
        double priceOfHome = (monthlyPayment*(1-(1/Math.pow(1+monthlyInt,months))))/monthlyInt;
        priceOfHome += downPayment;
        return priceOfHome;
    }
}
