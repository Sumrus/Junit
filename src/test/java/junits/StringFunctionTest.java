package junits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringFunctionTest {
	
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrom("madam"));
		
	}
	
	@CustomAnnotation
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrom("Sumit"));
		
	}

}
