import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	@Test
	void numeroPositivo() {
		FizzBuzz fizzBuzz = new FizzBuzz(1);
		assertTrue(fizzBuzz.isNumeroPositivo());
		
		FizzBuzz fizzBuzzNegativo = new FizzBuzz(-1);
		assertFalse(fizzBuzzNegativo.isNumeroPositivo());
	}
	
	@Test
	void numeroMultiploPor3() {
		FizzBuzz fizzBuzz = new FizzBuzz(3);		
		assertTrue(fizzBuzz.isMultiploPor3());
		
		FizzBuzz fizzBuzz1 = new FizzBuzz(5);		
		assertFalse(fizzBuzz1.isMultiploPor3());		
	}
	
	@Test
	void numeroMultiploPor5() {
		FizzBuzz fizzBuzz = new FizzBuzz(25);		
		assertTrue(fizzBuzz.isMultiploPor5());
		
		FizzBuzz fizzBuzz1 = new FizzBuzz(2);		
		assertFalse(fizzBuzz1.isMultiploPor5());
	}
	
	@Test
	void numeroMultiploPor3EnumeroMultiploPor5() {
		FizzBuzz fizzBuzz = new FizzBuzz(15);		
		assertTrue(fizzBuzz.isMultiploPor5());
		
		FizzBuzz fizzBuzz1 = new FizzBuzz(15);		
		assertTrue(fizzBuzz1.isMultiploPor3());
		
		FizzBuzz fizzBuzz2 = new FizzBuzz(2);		
		assertFalse(fizzBuzz2.isMultiploPor5());
		
		FizzBuzz fizzBuzz3 = new FizzBuzz(2);		
		assertFalse(fizzBuzz3.isMultiploPor3());
	}
	
	@Test
	void escreveNumeroApenasMultiplo3() {
		FizzBuzz fizzBuzz = new FizzBuzz(3);
		assertEquals("Fizz", fizzBuzz.escrever());
	}
	
	@Test
	void escreveNumeroApenasMultiplo5() {
		FizzBuzz fizzBuzz = new FizzBuzz(5);
		assertEquals("Buzz", fizzBuzz.escrever());
	}
	
	@Test
	void escreveNumeroMultiplo3EMultiplo5() {
		FizzBuzz fizzBuzz = new FizzBuzz(15);
		assertEquals("FizzBuzz", fizzBuzz.escrever());
	}
	
	@Test
	void escreveNumeroNaoMultiplo() {
		FizzBuzz fizzBuzz = new FizzBuzz(8);
		assertEquals("8", fizzBuzz.escrever());
	}
}
