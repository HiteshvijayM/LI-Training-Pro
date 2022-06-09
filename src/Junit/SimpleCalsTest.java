package Junit;

import static org.junit.Assert.assertEquals;

class SimpleCalsTest {

	@Test
	void test() {
		SimpleCals obj = new SimpleCals();
		assertEquals(4, obj.add(2, 2));
		
	}
	
	@Test
	void test1() {
		SimpleCals obj1 = new SimpleCals();
		assertEquals(6, obj1.add(4, 2));	
	}

}
