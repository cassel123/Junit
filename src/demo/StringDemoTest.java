package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {
	private StringDemo str;

	@Before
	public void setUp() throws Exception {
		str = new StringDemo();
		
	}

	@Test
	public void testStringDemo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSmallString1() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString2() {
		assertEquals("一个字母变小写",str.smallString("B"),"error");
	}
	
	@Test
	public void testSmallString3() {
		assertEquals("一个字母变小写",str.smallString("1"),"error");
	}
	
	@Test
	public void testSmallString4() {
		assertEquals("一个字母变小写",str.smallString(" "),"error");
	}
	
	@Test
	public void testSmallString5() {
		assertEquals("一个字母变小写",str.smallString(""),"a");
	}
	
	@Test
	public void testSmallString6() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString7() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString8() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}

	@Test
	public void testSmallString10() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
}
