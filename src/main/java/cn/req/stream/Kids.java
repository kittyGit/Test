package cn.req.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Kids {

    public static Set<String> getKidNames7(List<Person> people) {
    	Set<String> kidNames=new HashSet<String>();
    	people.forEach(peo->{
    		if(peo.getAge()<18){
    		String name=peo.getFirstName();
    		kidNames.add(name);
    		}
    	});
    	return kidNames;
    }

    public static Set<String> getKidNames(List<Person> people) {
    	
    	return people.stream().filter(peo -> peo.getAge()<18).map(peo -> peo.getFirstName()).collect(Collectors.toSet());
    	
    	
    }

}
