package cn.req.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterCollection {

	public static List<String> transform7(List<String> collection) {
		
		List<String> names=new ArrayList<>();
		collection.forEach(coll->{
			if(coll.length()<4){
				names.add(coll);
			}
		});
		
		return names;
	}

	public static List<String> transform(List<String> collection) {
		
		Predicate<String> p = name -> name.length() < 4;
		
		return collection.stream().filter(p).collect(Collectors.toList());
	}

}
