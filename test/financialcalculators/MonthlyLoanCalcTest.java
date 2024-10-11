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
public class MonthlyLoanCalcTest {
    
    public MonthlyLoanCalcTest() {
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
     * Test of monthlyLoanPayment method, of class MonthlyLoanCalc.
     */
    @Test
    public void monthlyloanzerointerest() {
        System.out.println("Test Zero Interest");
        double interestRate = 0.0;
        int yrs = 10;
        double initAmount = 120;
        double expResult = 1;
        double result = MonthlyLoanCalc.monthlyLoanPayment(interestRate, yrs, initAmount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void monthlyloanpositiveinterest(){
        System.out.println("Test positive interest");
        double interestRate = 10.0;
        int yrs = 10;
        double initAmount = 120;
        double expResult = 1.59;
        double result = MonthlyLoanCalc.monthlyLoanPayment(interestRate, yrs, initAmount);
        assertEquals(expResult, result, 0);
    }
    public void monthlyloannegativeinterest(){
        
    }
    public void monthlyloanzeroyears(){
        
    }
    public void monthlyloanpositiveyears(){
        
    }
    public void monthlyloannegativeyears(){
        
    }
    @Test
    public void monthlyloanzeroinitamount(){
        System.out.println("Test zero initial amount");
        double interestRate = 10.0;
        int yrs = 10;
        double initAmount = 0;
        double expResult = 0;
        double result = MonthlyLoanCalc.monthlyLoanPayment(interestRate, yrs, initAmount);
        assertEquals(expResult, result, 0);
    }
    public void monthlyloanpositiveinitamount(){
        
    }
    public void monthlyloannegativeinitamount(){
        
    }
}
