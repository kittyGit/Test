package cn.req.stream;

import org.junit.Test;

import java.util.List;

import static cn.req.stream.OldestPerson.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Get oldest person from the collection
 */
public class OldestPersonSpec {

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(getOldestPerson7(collection)).isEqualToComparingFieldByField(eva);
    }

}
