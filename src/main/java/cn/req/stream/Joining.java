package cn.req.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Joining {

	public static String namesToString7(List<Person> people) {

		StringBuffer concatedName = new StringBuffer();
//		concatedName.append("Names: ");
//
//		 people.forEach(peo->{
//		 String name=peo.getName();
//		
//		 concatedName.append(name).append(", ");
//		
//		 });
//		
//		 concatedName.setLength(concatedName.toString().length() - 2);

		IntStream.range(0, people.size()).forEach(i -> {
			String name = people.get(i).getName();

			if (i == people.size() - 1) {
				concatedName.append(name).append(".");
			} else {
				concatedName.append(name).append(", ");
			}
		});

		concatedName.append(".");
		return concatedName.toString();
	

	}

	public static String namesToString(List<Person> people) {
		//return people.stream().filter(peo -> peo.getAge()<18).map(peo -> peo.getName()).collect(Collectors.toSet());
		
		return people.stream().map(peo-> peo.getName()).collect(Collectors.joining(", ", "Names: ", "."));
	}

}