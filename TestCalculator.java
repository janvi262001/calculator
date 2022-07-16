import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculator {
	
	private Calculator calculator;
	
 	@BeforeTest
 	public void init()
 	{
 		calculator=new Calculator();
 	}
	public void emptyStringReturnsZero() {
		
		assertEquals(calculator.calculate(""),0); //we have to make sure that the code is failing
	}
	
	public void singleValueEntered()
	{
		assertEquals(calculator.calculate("1"),0);
	}
	
	public void twoNumbersReturnsSum()
	{
		assertEquals(calculator.calculate("1,2"),3);
	}
}