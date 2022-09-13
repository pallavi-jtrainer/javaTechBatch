package demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class MainClass {

	public static void main(String[] args) {
//		Path path = Paths.get("E:\\training\\hexaware\\Java Technology\\8Sep-12Oct(JT)\\workspace\\test.txt");
//		
//		try {
//			String data = Files.readString(path);
//			System.out.println(data);
//			
//			String info = "This is Java 11 File API";
//			path = Files.writeString(path, info);
//			
//			data = Files.readString(path);
//			System.out.println(data);
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}

		List<String> status = Arrays.asList("Open", "Closed", "In Process");
		
		String res = status.stream()
				.map((var x) -> {"Error".concat(x);})
				.collect(Collectors.joining("\n"));
		System.out.println(res);
	}

}
