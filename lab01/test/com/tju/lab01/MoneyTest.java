package com.tju.lab01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {

	@Before
	public void setUp() throws Exception {
		Money money;
	}

	@Test
	public void test1() {
		assertEquals(Money.possibleAmount(93), true);
//		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		assertEquals(Money.possibleAmount(83), true);
	}
	
	@Test
	public void test3() {
		assertEquals(Money.possibleAmount(59), false);
	}

}
