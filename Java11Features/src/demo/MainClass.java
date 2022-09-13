package demo;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
//		System.out.println("".isBlank());
//		
//		String str = "Hello";
//		System.out.println(str.isBlank());

		String s = "Hello\nWorld!!\nWelcome\nto\nJava 11";
		System.out.println(s);
		
		List<String> strings = s.lines().collect(Collectors.toList());
		System.out.println(strings);
	}

}
