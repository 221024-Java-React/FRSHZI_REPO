package Lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab8Tests {

	Lab8 lab;

	@BeforeEach 
	public void before() {
		lab = new Lab8();
	}

	@Test
	void Reserve_InputString_ReturnsReverseString() {
		
		String var = lab.reverse("abc");

		assertEquals(var, "cba");
	}

	@Test
	void Reserve_MultipleWordsInString_ReturnsReverseString() {

		String var = lab.reverse("ABC DEF GHI");

		assertEquals(var, "IHG FED CBA");
	}
	
	@Test
	void Reserve_InputStringAssertWrongValue_ReturnsFalse()  {

		String var = lab.reverse("ABC");

		assertNotEquals(var, "BCA");
	}
	
	@Test
	void Reserve_InputEmptyString_ThrowsException() {

		assertThrows(NullPointerException.class,
	            ()->{
	            	lab.reverse("");
	            });
	}

}