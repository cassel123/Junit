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
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString2() {
		assertEquals("һ����ĸ��Сд",str.smallString("B"),"error");
	}
	
	@Test
	public void testSmallString3() {
		assertEquals("һ����ĸ��Сд",str.smallString("1"),"error");
	}
	
	@Test
	public void testSmallString4() {
		assertEquals("һ����ĸ��Сд",str.smallString(" "),"error");
	}
	
	@Test
	public void testSmallString5() {
		assertEquals("һ����ĸ��Сд",str.smallString(""),"a");
	}
	
	@Test
	public void testSmallString6() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString7() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString8() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}

	@Test
	public void testSmallString10() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}
}