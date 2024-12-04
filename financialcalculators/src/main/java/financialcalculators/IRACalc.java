package financialcalculators;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabri
 */
public class IRACalc {
    public static double calculate_MaximizeContributionNo(double PI, double Ca, double r, int n) {
            
            // Calculate FVcurrentBalance
            double FVcurrentBalance = PI * Math.pow((1 + r), n);
            System.out.println("NO- current: " + FVcurrentBalance);

            // Calculate FVanualcontribution
            double FVanualcontribution = Ca * (Math.pow((1 + r), n) - 1) / r;
            System.out.println("NO annual: " + FVanualcontribution);

            // Calculate total future value
            double futureValue = FVanualcontribution + FVcurrentBalance;
            System.out.println("Total future value: " + futureValue);
            return futureValue;
    }
        //------------------------------------------Yes
        public static double calculate_MaximizeContributionYes(double PI, double Ca, double r, int C_age, int R_age) {
        double balance = 0;
        r=r/100;
        if (R_age <= 50 || (C_age >= 50 && R_age >= 50)) {
            int Under50 = R_age - C_age;
            balance += Ca * (Math.pow(1 + r, Under50) - 1) / r;
            balance += PI * Math.pow(1 + r, Under50);
        } else {
            int Under50 = 50 - C_age;
            balance += Ca * (Math.pow(1 + r, Under50) - 1) / r;
            balance += PI * Math.pow(1 + r, Under50);

            int Over50 = R_age - 50;
            for (int i = 0; i < Over50; i++) {
                double RothIraunder50 = balance * r;
                balance += RothIraunder50 + 8000;
            }
        }

        System.out.println("Balance: " + balance);

        return balance;
    }
        //----------------------------------------------------------------------------------------------------------------------------Extra Calculation for RothIRAYEs
        public static double[] extraCalculationsRothIRACalculatorYES(double PI, double Ca, int C_age, int R_age, double result) {
        double balance = 0;
        double totalInterest = 0;

        if (R_age <= 50 || (C_age >= 50 && R_age >= 50)) {
            // Case where age at retirement is 50 or younger, or both current and retirement age are above 50
            int Under50 = R_age - C_age;
            balance = PI + (Ca * Under50);
            totalInterest = (result - balance) + Ca;
        } else {
            // Case where retirement age is over 50
            int Under50 = 50 - C_age;
            int Over50 = R_age - 50;
            balance = PI + (Ca * Under50);
            Ca = 8000; // Update annual contribution for over 50
            balance += Ca * Over50;
            totalInterest = (result - balance)+Ca;
        }

        // Return balance and total interest as an array
        return new double[] {
            Math.round(balance * 100.0) / 100.0,       // Rounded balance
            Math.round(totalInterest * 100.0) / 100.0  // Rounded total interest
        };
    }
}
