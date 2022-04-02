package PackageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassTest {

	@Tag("Sanity")
	@Test
	public void TestB() {
		
		System.out.println("Inside Test B");
	}
}
