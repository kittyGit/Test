package cn.req.stream;

import org.junit.Test;

import java.util.List;

import static cn.req.stream.Joining.namesToString7;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Return people names separated by comma
 */
public class JoiningSpec {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertThat(namesToString7(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }

}
