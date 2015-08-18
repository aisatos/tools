package com.ais.tools.guava;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;
import static org.junit.Assert.*;

import junit.framework.TestCase;

public class OptionalsTest{

	@Test
	public void testPresent(){
		Optional<String> someString = getSomeString();
		
		assertTrue("getSomeString should return a present optional", someString.isPresent());
	}
	
	@Test(expected = RuntimeException.class)
	public void testExceptionAbsent(){
		Optional<String> someString = getNoString();
		
		someString.get();
	}
	
	Optional<String> getSomeString(){
		return Optional.of("some string");
	}
	
	Optional<String> getNoString(){
		return Optional.ofNullable(null);
	}
}


