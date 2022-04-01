package Phase5.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ParameterTest {

	int input;
	String output;
	AgeValidation agevalid;
	@Before
	public void init() {
		 agevalid=new AgeValidation();	
		 System.out.println("@before code intiated ");
	}
	public ParameterTest(int input, String output) {
		this.input = input;
		this.output = output;
	}

	@Parameterized.Parameters
	public static Collection testDataSet() {
		return Arrays.asList( new Object[][] {
			{18,"valid age to vote"},
			{24,"valid age to vote"},
			{14,"not valid to vote"}
			});
	}


	@Test
	public void test() {
		assertEquals(output,agevalid.ageValidator(input) );
	}


}
