package assignment.level2;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert; 
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Main objCalcUnderTest;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp() {
    //Arrange
    objCalcUnderTest = new Main();
    }

    @Test
    public void testAdd() { 
    int a = 15; int b = 20; 
    int expectedResult = 35;
    //Act 
    long result = objCalcUnderTest.add(a, b);
    //Assert
    Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
    int a = 25; int b = 20; 
    int expectedResult = 5; 
    long result = objCalcUnderTest.substract(a, b);
    Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
    int a = 10; int b = 25;
    long expectedResult = 250;
    long result = objCalcUnderTest.multiply(a, b);
    Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
    int a = 12; int b = 4; 
    double expectedResult = 3; 
    double result = objCalcUnderTest.divide(a, b);
    Assert.assertEquals(expectedResult, result, DELTA); 
    }
    
  

  }

