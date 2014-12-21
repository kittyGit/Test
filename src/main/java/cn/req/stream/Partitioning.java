package cn.req.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partitioning {

	public static Map<Boolean, List<Person>> partitionAdults7(
			List<Person> people) {
		Map<Boolean, List<Person>> person = new HashMap<Boolean, List<Person>>();

		people.forEach(peo -> {
			if (peo.getAge() > 18) {
				List<Person> adults = new ArrayList<>();
				if (person.containsKey(true)) {
					adults = person.get(true);
				}
				adults.add(peo);
				person.put(true, adults);
			} else {
				List<Person> kids = new ArrayList<>();
				if(person.containsKey(false)){
					kids=person.get(false);
				}
				kids.add(peo);

				person.put(false, kids);
			}
		});

		return person;
	}

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		return null;
	}

}
