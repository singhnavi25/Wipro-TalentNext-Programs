package MockitoTestingModule;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoTestCalculatorClass 
{
	@Mock
	Calculator calObj;
	
	
	@Before
	public void create()
	{
		MockitoAnnotations.initMocks(this);
		when(calObj.add(3, 4)).thenReturn(3); // We define our own answer for fix input
		when(calObj.sub(4, 6)).thenReturn(-2);
		when(calObj.mul(Mockito.anyInt() , Mockito.eq(0))).thenReturn(0);
		when(calObj.div(Mockito.anyInt(), Mockito.eq(0))).thenThrow(new ArithmeticException("Arithmatic exceptiona"));		
	}

	@Test
	public void testAdd()
	{
		assertSame(3, calObj.add(3,  4));
	}
	
	@Test
	public void testSub()
	{
		assertSame(-2, calObj.sub(4, 6));
	}
	
	@Test
	public void testMul()
	{
		assertSame(0, calObj.mul(6, 0));
	}
	
	@Test(expected = RuntimeException.class)
	public void testDiv()
	{
		calObj.div(5, 0);
	}
}
