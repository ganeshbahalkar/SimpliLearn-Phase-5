package Phase5.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgeTest {
	AgeValidation agevalid;
	@Before
	public void init() {
		 agevalid=new AgeValidation();	
		 System.out.println("@before code intiated ");
	}
	
	@Test
	public void test1() {
		
		assertEquals("valid age to vote",agevalid.ageValidator(24));
		System.out.println("@test of test1 intiated");
	}
	
	
	@Test
	public void test2() {
		
		assertEquals("not valid to vote",agevalid.ageValidator(14));
		System.out.println("@test of test2 intiated");
	}
	
	@After
	public void destroyobj() {
		agevalid=null;
		System.out.println("@After intiated and object made as null");
	}

}
