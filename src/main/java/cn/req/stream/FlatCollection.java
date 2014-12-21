package cn.req.stream;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class FlatCollection {

    public static List<String> transform7(List<List<String>> collection) {
    	List<String> names=new ArrayList<>();
    	collection.forEach(coll->{
    		collection.forEach(col->{
    			names.addAll(coll);
    		});
    	});
    	return names;
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream() // Convert collection to Stream
                .flatMap(value -> value.stream()) // Replace list with stream
                .collect(toList()); // Collect results to a new list
    }

}
