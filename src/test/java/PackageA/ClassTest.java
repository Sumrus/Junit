package PackageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Tag("Sanity")
	@Test
	public void TestA() {
		
		System.out.println("Inside Test A");

	}

}
