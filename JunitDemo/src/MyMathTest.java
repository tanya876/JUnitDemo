import static org.junit.Assert.*;

import org.junit.Test;


public class MyMathTest {
	MyMath mymath=new MyMath();
	
    
	@Test
	public void sum_with3numbers(){
		System.out.println("test1");
		assertEquals(6,mymath.sum(new int[]{1,2,3}));
	}
	public void sum_with1numbers(){
		System.out.println("test2");
		assertEquals(3,mymath.sum(new int[]{3}));
	}

}
