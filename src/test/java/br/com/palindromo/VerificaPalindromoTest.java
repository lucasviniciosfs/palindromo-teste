package br.com.palindromo;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class VerificaPalindromoTest{
	
	@Test
	public void main() {
		
		VerficaPalindromo verificaPalindromo = new VerficaPalindromo();
		
		Assert.assertEquals(true,verificaPalindromo.ehPalindromo("ovo"));
		//sAssert.assertEquals(true,verificaPalindromo.ehPalindromo("asa"));
	}
}
