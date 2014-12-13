package cn.req.stream;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class FilterCollection {

	public static List<String> transform7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String element : collection) {
			if (element.length() < 4) {
				newCollection.add(element);
			}
		}
		return newCollection;
	}

	public static List<String> transform(List<String> collection) {
		return collection.stream().filter(e -> e.length() < 4)
				.collect(toList());
	}

}