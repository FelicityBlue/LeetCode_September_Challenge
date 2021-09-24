package tribonnaci;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class tribonnaciTest {
	
	tribonnaci t;
	
	@Before
	public void setUp() 
	{
		t = new tribonnaci ();

	}
	
	@After
	public void tearDown() 
	{
	
		t = null;
	}
	

	@Test
	public void testcheckTribonacci() {
		
		assertEquals(4,t.checkTribonacci(4) );
		
		assertEquals(2,t.checkTribonacci(3) );
		
		assertEquals(1389537,t.checkTribonacci(25) );
		
		assertEquals(0,t.checkTribonacci(0) );
		
		assertEquals(1,t.checkTribonacci(1) );
		
		assertEquals(1,t.checkTribonacci(2) );
		
		
		
	}
	

}
