import static org.junit.Assert.*;

import org.junit.*;



public class CalculatorTest {
   
	private Calculator calc;
	
	@Before
	public void setup() throws Exception{
		calc=new Calculator();
	}
	@After
	public void tearDown() throws Exception{
		calc=null;
	}
	
	@Test
	public void testAdd() {
		double result=calc.add(2.5, 100);
		assertEquals(102.5,result,0);
		
	}

	@Test
	public void testMultiple() {
		double result=calc.multiple(10,2);
		assertEquals(20,result,0);
	}

	@Test
	public void testSubtract() {
		double result=calc.subtract(100.5, 100);
		assertEquals(0.5,result,0);
	}

	@Test
	public void testDivide() {
		double result=calc.divide( 100,10);
		assertEquals(10,result,0.001);
	}

}
