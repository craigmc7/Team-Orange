/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package financialcalculators;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mwrai
 */
public class HouseAffordabilityTest {
    
    public HouseAffordabilityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of HouseAffordabilityCalc method, of class HouseAffordability.
     */
    @Test
    public void testHouseAffordabilityCalc() {
        System.out.println("HouseAffordabilityCalc");
        double annualIncome = 70000.00;
        double downPayment = 0.0;
        double percentOfIncome = 30.0;
        double intRate = 6.5;
        double loanLength = 30.0;
        double expResult = 276869;
        double result = HouseAffordability.HouseAffordabilityCalc(annualIncome, downPayment, percentOfIncome, intRate, loanLength);
        result = Math.round(result);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testZeroOrNegativeIncome() {
        System.out.println("Zero/Negative Income");
        double annualIncome = 0.0;
        double downPayment = 0.0;
        double percentOfIncome = 30.0;
        double intRate = 10.0;
        double loanLength = 30.0;
        double expResult = -1;
        double result = HouseAffordability.HouseAffordabilityCalc(annualIncome, downPayment, percentOfIncome, intRate, loanLength);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNegativeDownPayment() {
        System.out.println("Negative Down Payment");
        double annualIncome = 70000.0;
        double downPayment = -10.0;
        double percentOfIncome = 30.0;
        double intRate = 10.0;
        double loanLength = 30.0;
        double expResult = -2;
        double result = HouseAffordability.HouseAffordabilityCalc(annualIncome, downPayment, percentOfIncome, intRate, loanLength);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNegativeOrZeroPercentOfIncome() {
        System.out.println("Negative or Zero Percent of Income");
        double annualIncome = 70000.0;
        double downPayment = 10.0;
        double percentOfIncome = -30.0;
        double intRate = 10.0;
        double loanLength = 30.0;
        double expResult = -3;
        double result = HouseAffordability.HouseAffordabilityCalc(annualIncome, downPayment, percentOfIncome, intRate, loanLength);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNegativeOrZeroLoanLength() {
        System.out.println("Negative or Zero Loan Length");
        double annualIncome = 70000.0;
        double downPayment = 10.0;
        double percentOfIncome = 30.0;
        double intRate = 10.0;
        double loanLength = -30.0;
        double expResult = -5;
        double result = HouseAffordability.HouseAffordabilityCalc(annualIncome, downPayment, percentOfIncome, intRate, loanLength);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNegativeIntRate() {
        System.out.println("Negative Interest Rate");
        double annualIncome = 70000.0;
        double downPayment = 10.0;
        double percentOfIncome = 30.0;
        double intRate = -10.0;
        double loanLength = 30.0;
        double expResult = -4;
        double result = HouseAffordability.HouseAffordabilityCalc(annualIncome, downPayment, percentOfIncome, intRate, loanLength);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
}
