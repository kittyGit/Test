package cn.req.stream;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatCollection {

    public static List<String> transform7(List<List<String>> collection) {
    	return null;
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream() // Convert collection to Stream
                .flatMap(value -> value.stream()) // Replace list with stream
                .collect(toList()); // Collect results to a new list
    }

}
