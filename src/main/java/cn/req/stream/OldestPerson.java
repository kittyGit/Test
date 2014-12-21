package cn.req.stream;

import java.util.List;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
    	
    	 Person[] max = {people.get(0)};
    	
    	people.forEach(peo->{
    	 
    		if( peo.getAge()>max[0].getAge()){
    		 max[0]=peo;
    		}
    	});
    	
    	return max[0];
    }

    public static Person getOldestPerson(List<Person> people) {
    	return null;
    }

}
