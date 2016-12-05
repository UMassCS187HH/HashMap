import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;


public class HashTest {
	private LLHashMap<String> hm;
	private LLHashMap<String> ha;
	ArrayList<String> strings = new ArrayList<String>();
	@Before
	public void before() {
		hm = new LLHashMap<String>();

		for(int i = 0; i < 10; i++){
			strings.add("foo");
		}
		for(int i = 0; i < 5; i++){
			strings.add("bar");
		}
		for(String s: strings){
			hm.put(s);
		}
		Scanner sc;
		ha = new LLHashMap<String>();
		String s = "";
		try {
			sc = new Scanner(new File("words.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				s += line;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    // You may want to check for a non-word character before blindly
		    // performing a replacement
		    // It may also be necessary to adjust the character class
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		for(String a: words)
			ha.put(a);
	}
	
	
	@Test
	public void test(){
		assertEquals(10, hm.get("foo"));
		assertEquals(5, hm.get("bar"));
		hm.put("bob");
		assertEquals(1, hm.get("bob"));
		assertEquals(-1, hm.get("not"));
	}
	
	@Test
	public void testHM(){
		assertEquals(21, ha.get("a"));
		assertEquals(66, ha.get("the"));
		assertEquals(1, ha.get("be"));
		assertTrue(true);
	}
}