package java8example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class JavaEightSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = (List<String>) Arrays.asList("java-6", "java-7","java-8");
		
		List<String> result = list.stream().filter(item -> !"java-7".equals(item)).collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}

}
