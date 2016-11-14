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
	}
	
	public void alternateBefore(){
		Scanner sc;
		try {
			sc = new Scanner(new File("words.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				int last = 0;
				int i = 0;
				while(i < line.length()){
					if(line.charAt(i) == ' '){
						hm.put(line.substring(last, i+1));
						last = i + 1;
					}
					i++;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(hm.get("a"));
	}
	
	@Test
	public void test(){
		assertEquals(10, hm.get("foo"));
		assertEquals(5, hm.get("bar"));
		hm.put("bob");
		assertEquals(1, hm.get("bob"));
		assertEquals(-1, hm.get("not"));
	}
}