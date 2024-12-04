import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IRACalculatorTest {

    @Test
    public void testIRACalculator() {
        // Test the IRACalculator method
        double PI = 10000;  // initial investment
        double Ca = 5000;   // annual contribution
        double r = 0.05;    // interest rate (5%)
        int n = 20;         // years

        double expected = 235609.179;  // Expected future value after 20 years
        double actual = IRACalculator.IRACalculator(PI, Ca, r, n);
        assertEquals(expected, actual, 0.01);  // Allowing a small margin of error for floating point comparison
    }

    @Test
    public void testCalculateMaximizeContributionYes() {
        // Test the calculate_MaximizeContributionYes method
        double PI = 10000;   // initial investment
        double Ca = 5000;    // annual contribution
        double r = 0.05;     // interest rate (5%)
        int C_age = 30;      // current age
        int R_age = 65;      // retirement age

        double expected = 341276.535;  // Example expected result after applying the formula
        double actual = IRACalculator.calculate_MaximizeContributionYes(PI, Ca, r, C_age, R_age);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testExtraCalculationsRothIRACalculatorYES() {
        // Test the extraCalculationsRothIRACalculatorYES method
        double PI = 10000;   // initial investment
        double Ca = 5000;    // annual contribution
        int C_age = 30;      // current age
        int R_age = 65;      // retirement age
        double result = 341276.535;  // Future value from previous calculation

        double[] expected = {341276.535, 5000}; // Example expected results
        double[] actual = IRACalculator.extraCalculationsRothIRACalculatorYES(PI, Ca, C_age, R_age, result);

        assertArrayEquals(expected, actual, 0.01); // Allowing small margin of error
    }

    // Additional tests can be added for other edge cases or boundary conditions
    @Test
    public void testIRACalculatorEdgeCase() {
        // Test with edge case values such as 0 contributions or negative rates
        double PI = 0;   // no initial investment
        double Ca = 0;   // no annual contribution
        double r = 0;    // zero interest rate
        int n = 10;      // years

        double expected = 0; // No future value expected when no investment is made
        double actual = IRACalculator.IRACalculator(PI, Ca, r, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMaximizeContributionYesEdgeCase() {
        // Test for edge case with retirement age very close to current age
        double PI = 10000; 
        double Ca = 5000; 
        double r = 0.05;  
        int C_age = 49;  // current age near retirement
        int R_age = 50;  // retirement age

        double expected = 11025.0;  // Example expected result for this scenario
        double actual = IRACalculator.calculate_MaximizeContributionYes(PI, Ca, r, C_age, R_age);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testExtraCalculationsRothIRACalculatorYESWithZeroRate() {
        // Test the Roth IRA calculation with zero interest rate
        double PI = 10000;  
        double Ca = 5000;   
        int C_age = 30;     
        int R_age = 65;     
        double result = 175000;  // Some future value

        double[] expected = {175000.0, 0};  // Expecting balance but no interest as r=0
        double[] actual = IRACalculator.extraCalculationsRothIRACalculatorYES(PI, Ca, C_age, R_age, result);

        assertArrayEquals(expected, actual, 0.01);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gabri
 */
public class IRACalculatorTest {
    
    public IRACalculatorTest() {
    }

    /**
     * Test of calculate_MaximizeContributionNo method, of class IRACalculator.
     */
    @Test
    public void testCalculate_MaximizeContributionNo() {
        System.out.println("calculate_MaximizeContributionNo");
        double PI = 0.0;
        double Ca = 0.0;
        double r = 0.0;
        int n = 0;
        double expResult = 0.0;
        double result = IRACalculator.calculate_MaximizeContributionNo(PI, Ca, r, n);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate_MaximizeContributionYes method, of class IRACalculator.
     */
    @Test
    public void testCalculate_MaximizeContributionYes() {
        System.out.println("calculate_MaximizeContributionYes");
        double PI = 0.0;
        double Ca = 0.0;
        double r = 0.0;
        int C_age = 0;
        int R_age = 0;
        double expResult = 0.0;
        double result = IRACalculator.calculate_MaximizeContributionYes(PI, Ca, r, C_age, R_age);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraCalculationsRothIRACalculatorYES method, of class IRACalculator.
     */
    @Test
    public void testExtraCalculationsRothIRACalculatorYES() {
        System.out.println("extraCalculationsRothIRACalculatorYES");
        double PI = 0.0;
        double Ca = 0.0;
        int C_age = 0;
        int R_age = 0;
        double result_2 = 0.0;
        double[] expResult = null;
        double[] result = IRACalculator.extraCalculationsRothIRACalculatorYES(PI, Ca, C_age, R_age, result_2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
