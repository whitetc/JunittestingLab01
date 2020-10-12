package Methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testAdd() {
		methods test = new methods();
		int output = test.add(1 , 4);
		assertEquals(5,output);	
		}
	@Test
	void testSubtract() {
		methods test = new methods();
		int output = test.subtract(9 , 4);
		assertEquals(5,output);	
		}
	@Test
	void testDivide() {
		methods test = new methods();
		int output = test.divide(10 , 2);
		assertEquals(5,output);	
		}
	@Test
	void testMultiply() {
		methods test = new methods();
		int output = test.multiply(9 , 4);
		assertEquals(36,output);	
		}
	@Test
	void testCircumference() {
		methods test = new methods();
		int output = (int) test.findCircumference(5);
		assertEquals(31,output);	
		
		}

}
