package com.virtusa.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.virtusa.INumberWorderConverter;
import com.virtusa.exception.NumberValidationException;

public class NumberWordConverterTest {
	
	// Positive test cases
	
	@Test
	public void testValidNumber_1 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(1);
	    assertEquals("one", test);
	}

	@Test
	public void testValidNumber_21 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(21);
	    assertEquals("twenty one", test);
	}
	
	@Test
	public void testValidNumber_105 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(105);
	    assertEquals("one hundred and five", test);
	}
	
	@Test
	public void testValidNumber_56945781 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(56945781);
	    assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", test);
	}
	
	@Test
	public void testValidNumber_999999999 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(999999999);
	    assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", test);
	}
	
	// Negative test cases
	
	@Test(expected = NumberValidationException.class)
	public void testInValidNumber_0 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(0);
	    assertEquals("one hundred and five", test);
	}
	
	@Test(expected = NumberValidationException.class)
	public void testInValidNumber_100000000 () {
	    INumberWorderConverter numberWordConverter = new NumberWordConverter();
	    String test = numberWordConverter.getWordFromNumber(1000000000);
	    assertEquals("one hundred and five", test);
	}
	
}
