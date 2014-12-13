package cn.req.stream;

import org.junit.Test;

import java.util.List;

import static cn.req.stream.ToUpperCase.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
 Convert elements of a collection to upper case.
 */
public class ToUpperCaseSpec {

	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
		assertThat(transform7(collection)).hasSameElementsAs(expected);
	}

}
