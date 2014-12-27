package cn.req.stream;

import static cn.req.stream.SortedByName.sortedByName7;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

/*
 Sort Person by lastName & firstName
 */
public class SortedByNameTest {

	@Test
	public void sortPeopleShouldReturnInOrder() {
		Person william = new Person("William", "Henderson");
		Person michael = new Person("Michael", "White");
		Person henry = new Person("Henry", "Brighton");
		Person hannah = new Person("Hannah", "Plowman");
		Person jane = new Person("Jane", "Henderson");

		List<Person> collection = asList(jane, michael, henry, hannah, william);

		List<Person> expected = asList(henry, jane, william, hannah, michael);

		assertThat(sortedByName7(collection)).hasSameElementsAs(expected);
	}
}
