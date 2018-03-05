package com.subh.mvn.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUNIT Test class
 *
 */
public class NumGeneratorTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		NumGenerator obj = new NumGenerator();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}
